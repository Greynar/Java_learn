package lesson20;

import jakarta.xml.bind.JAXB;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeRunner {

    private static FileWriter file;
    private static final List<Department> DEPARTMENTS = List.of(new Department("IT", "Moscow"),
            new Department("Finance", "Rostov"),
            new Department("Marketing", "Sochi"),
            new Department("Technical Support", "Saint-Petersburg"));

    private static final List<Position> POSITIONS = List.of(new Position("Developer", new BigDecimal(1000)),
            new Position("Tester", new BigDecimal(800)),
            new Position("Senior Developer", new BigDecimal(1500)),
            new Position("Team Leader", new BigDecimal(2000)),
            new Position("IT Director", new BigDecimal(2500)));

    public static void main(String[] args) throws Exception {
        System.out.println("Начало работы программы:");
        ListOfEmployee employees = new ListOfEmployee(List.of(
                getEmployee("vasyaiva", "Иванов Василий Витальевич"),
                getEmployee("admin111", "Мягкова Анна Иоановна"),
                getEmployee("superuser", "Крендель Екатерина Романовна"),
                getEmployee("header5", "Гобратко Иван Петрович"),
                getEmployee("xsizecar", "Поршнев Валерий Владимирович")));
        Path path = Paths.get("E:\\Java\\employee.xml");
        writeToXML(employees, path);

        try (InputStream is = EmployeeRunner.class.getResourceAsStream(path.toString())) {
            Document xmlDocument = getXML(path.toFile());
            XPath xPath = XPathFactory.newInstance().newXPath();
            double avg = (Double) xPath.compile("sum(//@salary) div count(//@salary)").evaluate(xmlDocument, XPathConstants.NUMBER);
            System.out.println("Среднее значение зарплат: " + avg);
            List<String> highSalaryEmployee = new ArrayList<>();
            System.out.println("Сотрудники с зарплатой выше средней -" + avg + " : ");
            NodeList nodeList = (NodeList) xPath.compile("//employee/position[@salary > " + avg + "]/ancestor::employee/fio/text()").evaluate(xmlDocument, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                highSalaryEmployee.add(nodeList.item(i).getNodeValue());
            }
            System.out.println(highSalaryEmployee);
        }

        System.out.println("Конвертация XML в JSON и запись в файл...");
        JSONObject jsonObject = XML.toJSONObject(String.join("", Files.readAllLines(path)));
        Path jsonPath = Paths.get("E:\\Java\\employee.json");
        Files.writeString(jsonPath, jsonObject.toString(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        File file = new File("E:\\Java\\employee.json");
        if (file.length() != 0) {
            System.out.println("Данные записаны в файл!");
        } else System.out.println("Данные не были записаны в файл!");
    }

    private static Document getXML(File file) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(file);
    }

    private static void writeToXML(ListOfEmployee employees, Path path) {
        if (!path.getParent().toFile().exists()) {
            path.getParent().toFile().mkdirs();
        }
        JAXB.marshal(employees, path.toFile());
    }

    private static Employee getEmployee(String login, String fio) {
        return new Employee().setLogin(login)
                .setFio(fio)
                .setPersonalNumber(new Random().nextInt(1000))
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt(POSITIONS.size())));
    }
}
