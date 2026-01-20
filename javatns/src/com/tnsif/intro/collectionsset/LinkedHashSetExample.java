package com.tnsif.intro.collectionsset;


	import java.util.LinkedHashSet;

	public class LinkedHashSetExample {
	    public static void main(String[] args) {
	        LinkedHashSet<String> set = new LinkedHashSet<>();
	        set.add("Red");
	        set.add("Green");
	        set.add("Blue");
	        set.add("Red"); 
	        
	        System.out.println("LinkedHashSet: " + set);
	    }
	}

