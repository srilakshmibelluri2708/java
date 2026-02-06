package com.tnsif.exceptionhandling;

public class handleException {
	public static void main(String[] args) {
		System.out.println("Exception handling");
		try {
			int a,b;
			a=10;
			b=0;
			int c =a/b;
			System.out.println(c);
		}catch (Exception e) {
			System.out.println("we can't divide it brooo!");
		}finally {//optional
			System.out.println("whatever happens iam always execute!");
		}

	}
}
