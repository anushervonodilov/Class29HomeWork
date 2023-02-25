package com.class29HomeWork;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        TreeSet<String> cities = new TreeSet<>();
        cities.add("Philadelphia");
        cities.add("Fairfax");
        cities.add("Austin");
        cities.add("Ottawa");
        cities.add("Amsterdam");

        System.out.println(cities);

        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);

    }
}
