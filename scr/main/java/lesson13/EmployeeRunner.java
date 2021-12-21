package lesson13;

import java.util.*;

public class EmployeeRunner {

    public static void main(String[] args) {
        Collection<Employee> employees = new HashSet<>();
        Collection<Employee> employees2 = new LinkedList<>();
        Collection<Employee> employees3 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getPersonalNumber().compareTo(o2.getPersonalNumber()) ;
            }
        });

        collectionFilling(employees);
        collectionFilling(employees2);
        collectionFilling(employees3);

        System.out.println(employees);
        System.out.println(employees2);
        System.out.println(employees3);

        System.out.println("Введите искомый стаж работы: ");
        Scanner scanner = new Scanner(System.in);
        printEmployee(employees, scanner.nextInt());
        System.out.println("Введите искомый стаж работы: ");
        printEmployee(employees2, scanner.nextInt());
        System.out.println("Введите искомый стаж работы: ");
        printEmployee(employees3, scanner.nextInt());

        System.out.println("Элементы 1ого списка: : ");
        System.out.println(employees);
        deleteOddElements(employees);
        System.out.println("Результат удаления нечетных элементов в 1ом списке: ");
        System.out.println(employees);
        System.out.println("--------------");

        System.out.println("Элементы 2ого списка: : ");
        System.out.println(employees2);
        deleteOddElements(employees2);
        System.out.println("Результат удаления нечетных элементов в 2ом списке: ");
        System.out.println(employees2);
        System.out.println("--------------");

        System.out.println("Элементы 3его списка: : ");
        System.out.println(employees3);
        deleteOddElements(employees3);
        System.out.println("Результат удаления нечетных элементов в 3ем списке: ");
        System.out.println(employees3);
    }

    public static void printEmployee(Collection<Employee> employees, int workAge){
        boolean success = false;
        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            if (next.getWorkAge() == workAge) {
                System.out.println(next.getName());
                success = true;
            }
        }
        if (!success){
            System.out.println("Сотрудника с указанным стажем не найдено.");
        }
    }

    public static void deleteOddElements(Collection<Employee> collection){
        if (collection instanceof Set) {
            boolean toDelete = false;
            for (Iterator<Employee> iterator = collection.iterator(); iterator.hasNext(); ) {
                Employee next = iterator.next();
                if (toDelete) {
                    iterator.remove();
                    toDelete = false;
                    continue;
                }
                toDelete = true;
            }
        } else if (collection instanceof List) {
            int size = collection.size();
            for (ListIterator<Employee> iterator = ((List<Employee>) collection).listIterator(collection.size()); iterator.hasPrevious(); ) {
                Employee next = iterator.previous();
                if ( ((List<Employee>) collection).indexOf(next) % 2 != 0) {
                    iterator.remove();
                }
            }
        }
    }

    public static void collectionFilling(Collection collection) {
        collection.add(new Employee(1, "Иванов Иван Иванович", 3));
        collection.add(new Employee(3, "Петров Петр Петрович", 2));
        collection.add(new Employee(2, "Вадимов Вадим Вадимович", 5));
        collection.add(new Employee(5, "Рязанцев Роман Алексеевич", 6));
        collection.add(new Employee(4, "Алексеев Алексей Алексеевич", 1));
        collection.add(new Employee(6, "Сергеев Сергей Сергеевич", 4));
        collection.add(new Employee(7, "Маликова Елизавета Игоревна", 3));
        collection.add(new Employee(8, "Максюков Вадим Иванович", 2));
        collection.add(new Employee(9, "Поль Анна Альбертовна", 10));
        collection.add(new Employee(11, "Магданов Магадан Магаданович", 12));
        collection.add(new Employee(10, "Карабасов Карабас Карабасович", 3));    }
}
