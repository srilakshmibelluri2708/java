package com.tnsif.intro.collectionsmap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(20, "Twenty");
        map.put(10, "Ten");
        map.put(30, "Thirty");
        
        System.out.println("TreeMap (sorted): " + map);
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}

