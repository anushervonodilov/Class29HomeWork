package com.class29HomeWork;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alex", 123);
        students.put("John", 456);
        students.put("Kelly", 789);

        System.out.println(students.keySet());

    }
}
