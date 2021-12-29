package lesson14;

import java.util.Collection;
import java.util.HashSet;

public class Contact {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final String phoneNumber;

    public Contact(){
        this(Names.randomizeSurname(), Names.randomizeName(), Names.randomizePatronymics(), PhoneNumbers.generatePhoneNumber());
    }

    public Contact(String name, String surname, String patronymic, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "}\n";
    }
}
