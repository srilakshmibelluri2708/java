package com.tnsif.intro.collectionsmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        
        map.remove(3);
        System.out.println("After remove: " + map);
        System.out.println("Contains key 1? " + map.containsKey(1));
    }
}



