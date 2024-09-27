package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Contact> data;

    public Phonebook() {
        this.data = new HashMap<>();
    }

    public Map<String, Contact> getData() {
        return data;
    }

    public void addContact(Contact contact) {
        data.put(contact.getCode(), contact);
    }

    public void deleteContact(String code) {
        data.remove(code);
    }

    public void showPhonebook() {
        for (Contact contact : data.values()) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Surnames: " + contact.getSurnames());
            System.out.println("Phone: " + contact.getPhone());
            System.out.println("Code: " + contact.getCode());
        }
    }
}
