package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class PhoneBook {

    Map<String, String> book = new HashMap<>();
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
}
