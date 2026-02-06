package com.tnsif.intro.threads;

public class ThreadDemo {
	 public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(
	                Thread.currentThread().getName() + " : " + i
	            );
	        }
	    }
	}

	

