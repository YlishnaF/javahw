package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /**
     * Реализовать телефонный справочник.
     * В справочнике есть фамилии и номера телефонов.
     * В справочнике обычно ищем номер по фамилии.
     * При этом могут быть однофамильцы -> за одной фамилией скрывается несколько номеров
     * <p>
     * Пример
     * "Иванов", "123456"
     * "Васильев", "321456"
     * "Петрова", "234561"
     * "Иванов", "234432"
     * "Петрова", "654321"
     * "Иванов", "345678"
     * <p>
     * Вывести номера по фамилии Иванов.
     */
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456"); // !
        phoneBook.add("Васильев", "321456");
        phoneBook.add("Петрова", "234561");
        phoneBook.add("Иванов", "234432"); // !
        phoneBook.add("Петрова", "654321");
        phoneBook.add("Иванов", "345678"); // !

        System.out.println(phoneBook.getBySurname("Иванов"));
    }
}

class PhoneBook {

    private Map<String, ArrayList<String>> storage = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        storage.computeIfAbsent(surname, k->new ArrayList<>()).add(phoneNumber);
    }

    public List<String> getBySurname(String surname) {
        return storage.get(surname);
    }
}