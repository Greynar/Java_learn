package lesson14;

import java.util.Collection;
import java.util.HashSet;

public class LinkedContact extends Contact{

    private Collection<Contact> linkedContacts;

    public  LinkedContact() {
        this.linkedContacts = new HashSet<>();
    }

    public Collection<Contact> getLinkedContacts() {
        return linkedContacts;
    }
}
