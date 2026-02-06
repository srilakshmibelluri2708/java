package com.tnsif.intro.lambda;


import java.util.function.Supplier;



public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> otp=()->{
			String s="";
			for(int i=1;i<=6;i++)
				s=s+(int)(Math.random()*10);
			return s;
		};
		System.out.println(otp.get());
	}
}
