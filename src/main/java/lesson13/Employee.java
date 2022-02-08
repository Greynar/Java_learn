package lesson13;

import java.util.Objects;

public class Employee {

    private Integer personalNumber;
    private String name;
    private int workAge;

    public Employee(Integer personalNumber, String fio, int seniority) {
        this.personalNumber = personalNumber;
        this.name = fio;
        this.workAge = seniority;
    }

    public Integer getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Integer personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personalNumber=" + personalNumber +
                ", fio='" + name + '\'' +
                ", workAge=" + workAge +
                "}\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalNumber, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return personalNumber == employee.personalNumber && Objects.equals(name, employee.name);
    }
}
