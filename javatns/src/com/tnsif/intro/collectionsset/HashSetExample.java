package com.tnsif.intro.collectionsset;

	import java.util.HashSet;

	public class HashSetExample {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Apple"); // duplicate ignored
	        
	        System.out.println("Set: " + set);
	        set.remove("Banana");
	        System.out.println("After remove: " + set);
	        
	        System.out.println("Contains Apple? " + set.contains("Apple"));
	        System.out.println("Size: " + set.size());
	    }
	}


