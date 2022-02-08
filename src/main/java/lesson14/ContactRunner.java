package lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContactRunner {


    public static final Integer LIMIT = 1000;
    public static final Integer LIMIT_LINKED_CONTACTS = 100;

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        LinkedContact[] contacts = fillArrayContacts();
        long after = System.currentTimeMillis() - now;
        System.out.printf("Массив из %d элементов заполнился за %.2f секунд.\n", LIMIT, after/1000.0);

        Collection<LinkedContact> contactsList = generateContactsAndMeasureTime(ContactRunner::fillListContacts);
        Collection<LinkedContact> contactsSet = generateContactsAndMeasureTime(ContactRunner::fillSetContacts);

        now = System.currentTimeMillis();
        for (LinkedContact contact: contactsList) {
            IntStream.range(0, LIMIT_LINKED_CONTACTS).boxed().map(i -> randomElementGetter(contactsList)).forEach(contact.getLinkedContacts()::add);
        }
        after = System.currentTimeMillis() - now;
        System.out.printf("Заполнение списка связанных контактов из %d элементов составило %.2f секунд.\n", LIMIT_LINKED_CONTACTS, after/1000.0);

        Map<Contact, Integer> mapOfContacts = contactsList.stream()
                .map(LinkedContact::getLinkedContacts)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(Function.identity(), contact -> 1, Integer::sum));

        mapOfContacts.entrySet().stream().max((c1, c2) -> c1.getValue().compareTo(c2.getValue())).ifPresent(System.out::println);

        System.out.println(contactsList);
    }

    public static Collection<LinkedContact> generateContactsAndMeasureTime(Supplier<Collection<LinkedContact>> supplier){
        long now = System.currentTimeMillis();
        Collection<LinkedContact> collection = supplier.get();
        long after = System.currentTimeMillis() - now;
        System.out.printf("Список из %d элементов заполнился за %.2f секунд.\n", LIMIT, after/1000.0);
        return collection;
    }

    private static LinkedContact[] fillArrayContacts() {
        LinkedContact[] contacts = new LinkedContact[LIMIT];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new LinkedContact();
        }
        return contacts;
    }

    private static List<LinkedContact> fillListContacts() {
        List<LinkedContact> contacts = new ArrayList<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> contacts.add(new LinkedContact()));
        return contacts;
    }

    private static Set<LinkedContact> fillSetContacts() {
        Set<LinkedContact> contacts = new HashSet<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> contacts.add(new LinkedContact()));
        return contacts;
    }

    private static Contact randomElementGetter(Collection<LinkedContact> collection) {
        int random = new Random().nextInt(collection.size());
        int i = 0;
        for (Contact contact: collection) {
            if (i++ == random ) {
                return contact;
            }
        }
        return null;
    }
}
