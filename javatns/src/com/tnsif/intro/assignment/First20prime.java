package com.tnsif.intro.assignment;

	class First20Primes {
	    public static void main(String[] args) {

	        int count = 0;
	        int num = 2;

	        while (count < 20) {
	            int flag = 0;

	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    flag = 1;
	                    break;
	                }
	            }

	            if (flag == 0) {
	                System.out.print(num + " ");
	                count++;
	            }

	            num++;
	        }
	    }
	}

