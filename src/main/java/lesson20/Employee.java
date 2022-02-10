package lesson20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlAttribute
    private int personalNumber;
    @XmlAttribute
    private String login;
    private String fio;
    private Department department;
    private Position position;

    @Override
    public String toString() {
        return "Employee{" +
                "personalNumber=" + personalNumber +
                ", login='" + login + '\'' +
                ", fio='" + fio + '\'' +
                ", department=" + department +
                ", position=" + position +
                "}\n";
    }
}
