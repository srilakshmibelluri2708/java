package com.tnsif.intro.collectionslist;

	import java.util.ArrayList;

	class Array{
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();

	        
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");

	        System.out.println("ArrayList: " + list);

	        
	        System.out.println("First element: " + list.get(0));

	       
	        list.remove("Banana");
	        System.out.println("After removal: " + list);
	    }
	}


