package ru.netology;

import java.util.*;

public class PhoneBook {

    TreeMap<String, String> book = new TreeMap<>();
    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }

    public String findByNumber(String number) {
        Optional<String> result = book.entrySet()
                .stream()
                .filter(entry -> number.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        return result.get();
    }

    public String findByName(String name) {
        return book.get(name);
    }

    public void printAllNames() {
        for(String name : book.keySet()) {
            if(Objects.equals(name, book.firstKey())) {
                System.out.print(name);
            } else {
                System.out.print(", " + name);
            }
        }
    }
}
