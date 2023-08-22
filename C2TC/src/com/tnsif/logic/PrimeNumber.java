package com.tnsif.logic;

	// Program to check given number is prime number or not
	// Prime number - a number that is divisible only by 1 and itself
	// Example - 2, 3, 5, 7, 11, 13

	public class PrimeNumber {

		public static void main(String[] args) {
			int num = 13;
			int count = 0;
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					count ++;
				}
			}
			if(count == 2) {
				System.out.println(" It Is Prime");
			}else {
				System.out.println("It Is Not Prime");
			}
			

		}

	}
