package com.tnsif.intro.constructors;

public class student {
	
	    int id;
	    String name;

	    // Default constructor
	    student() {
	        id = 0;
	        name = "Unknown";
	    }

	    void display() {
	        System.out.println(id + " " + name);
	    }

	    public static void main(String[] args) {
	        student s = new student();
	        s.display();
	    }
	}

