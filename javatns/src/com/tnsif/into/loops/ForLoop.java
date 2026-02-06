package com.tnsif.into.loops;

public class ForLoop {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
		for(int a=1;a<5;a++) {
			for(int b=1;b<5;b++) {
				System.out.print(" * ");
				}
			System.out.println();
		}
		for(int a=1;a<6;a++) {
			for(int b=1;b<a;b++) {
				System.out.print(" * ");
				}
			System.out.println(); 
		}
			System.out.println("////////////////////////");

	
		for(int c=6;c>=1;c--) {
			for(int d=1;d<c;d++) {
				System.out.print(" * ");
				}
			System.out.println();


}
}
}
