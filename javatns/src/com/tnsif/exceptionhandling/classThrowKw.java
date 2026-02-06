package com.tnsif.exceptionhandling;

public class classThrowKw {
	public static void main(String[] args) {
		System.out.println("throw Concept");
		int age = 12;
		if(age>18)
			System.out.println("yu are eligible!");
		else
			throw new ArithmeticException("yu are not eligible broo!");
	}
}
