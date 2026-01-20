package com.tnsif.intro.collectionslist;

	import java.util.LinkedList;

	public class LinkedListExample {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Dog");
	        list.add("Cat");
	        list.addFirst("Elephant");
	        list.addLast("Fox");
	        
	        System.out.println("List: " + list);
	        list.removeFirst();
	        System.out.println("After removeFirst: " + list);
	        list.removeLast();
	        System.out.println("After removeLast: " + list);
	        
	        System.out.println("Element at index 1: " + list.get(1));
	        System.out.println("Size: " + list.size());
	    }
	}

