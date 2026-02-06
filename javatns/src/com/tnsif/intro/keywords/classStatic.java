package com.tnsif.intro.keywords;

public class classStatic {
	public static void main(String[] args) {
		System.out.println(staticexplain.a);	
		staticexplain.show();
	}
	class staticexplain{	
		static int a = 10;//variable
		static void show() {//method
			System.out.println("hello world");
		}
		static {//block
			System.out.println("yoooo!");
		}
	}
}
