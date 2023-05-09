package ru.netology;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    Map<String, String> book = new HashMap<>();
    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }
}
