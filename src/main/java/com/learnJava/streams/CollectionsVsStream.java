package com.learnJava.streams;

import java.util.ArrayList;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        names.remove(0);
        System.out.println(names);
    }
}
