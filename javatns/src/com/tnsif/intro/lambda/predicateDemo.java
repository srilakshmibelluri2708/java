package com.tnsif.intro.lambda;
import java.util.function.Predicate;


public class predicateDemo {


		public static void main(String[] args) {
			Predicate<Integer> isEven=x->x%2==0;
			System.out.println(isEven.test(10));
			System.out.println(isEven.test(15));
		}

	}

