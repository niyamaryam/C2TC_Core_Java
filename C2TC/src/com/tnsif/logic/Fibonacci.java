package com.tnsif.logic;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		//fibonacci series in java
		//0 1 1 2 3 5 8.....
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fib number:");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		
		
		

	}

}
