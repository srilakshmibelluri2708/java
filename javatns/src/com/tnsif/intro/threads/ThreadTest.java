package com.tnsif.intro.threads;

public class ThreadTest {
	  public static void main(String[] args) {

	    	 ThreadDemo task = new  ThreadDemo();

	        Thread t1 = new Thread(task, "Thread-1");
	        Thread t2 = new Thread(task, "Thread-2");

	        t1.start();
	        t2.start();
	    }
}
