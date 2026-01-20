package com.tnsif.intro.collectionslist;

	import java.util.Vector;

	public class VectorExample {
	    public static void main(String[] args) {
	       
	        Vector<String> fruits = new Vector<>();
	        
	        
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.addElement("Mango"); // legacy method
	        
	        System.out.println("Vector: " + fruits);
	        
	        
	        System.out.println("First element: " + fruits.firstElement());
	        System.out.println("Last element: " + fruits.lastElement());
	        System.out.println("Element at index 2: " + fruits.get(2));
	        
	       
	        fruits.remove("Banana");
	        fruits.removeElement("Cherry"); // legacy removal
	        System.out.println("After removals: " + fruits);
	        
	     
	        System.out.println("Size: " + fruits.size());
	        System.out.println("Contains Mango? " + fruits.contains("Mango"));
	    }

}
