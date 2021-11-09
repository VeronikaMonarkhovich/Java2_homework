package com.taory;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysExample {
    public static void main (String [] args) {

        int[] array1 = new int[]{5, 3, 8, 9, 6};
        String[] array2 = new String[]{"hello", "bye", "thanks", "please"};
        System.out.println("Print array1:");
        for (int i1 = 0; i1 < array1.length; i1++) {
            System.out.println(array1[i1] + " ");
        }

        System.out.println("Print array2:");
        for (int i2 = 0; i2 < array2.length; i2++) {
            System.out.println(array2[i2] + " ");
        }

        Arrays.sort(array1);
        System.out.println("Sort array1:");
        for (int i1 = 0; i1 < array1.length; i1++) {
            System.out.println(array1[i1] + " ");
        }


        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("lemon");
        System.out.println("Print stringList:");
        for (String element : stringList) {
            System.out.println(element);
        }

        stringList.remove(2);
        System.out.println("Print stringList:");
        for (String element : stringList) {
            System.out.println(element);
        }

        stringList.remove("lemon");
        System.out.println("Print stringList:");
        for (String element : stringList) {
            System.out.println(element);
        }


        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(44);
        integerSet.add(6);
        integerSet.add(10);
        System.out.println("Print integerSet:");
        for (Integer element : integerSet) {
            System.out.println(element);
        }

        System.out.println(integerSet.size());
        integerSet.clear();
        System.out.println("Print integerSet:");
        for (Integer element : integerSet) {
            System.out.println(element);
        }


        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"cat");
        map1.put(2,"dog");
        map1.put(3,"bird");
        map1.put(4,"mouse");
        map1.put(5,"monkey");

        System.out.println("Print values " + map1.values());
        System.out.println("Print keys " + map1.keySet());
        map1.remove(5);
        System.out.println("Print keys " + map1.keySet());
        System.out.println("Print values " + map1.values());


        TreeMap<Integer,String> sortedMapByKey = new TreeMap<>();
        sortedMapByKey.putAll(map1);

        System.out.println("Sorting by key:");
        for (Map.Entry entry : sortedMapByKey.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }


        Map <Integer, String> sortedMapByValue = map1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println("Sorting by value:");
        for (Map.Entry entry : sortedMapByValue.entrySet()) {
            System.out.println("Value: " + entry.getValue() + " Key: "
                    + entry.getKey());
        }
    }
}