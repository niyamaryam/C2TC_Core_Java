package com.tnsif.core;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("enter numbers for multiplication:");
		
		Scanner sc = new Scanner(System.in);//taking input from user or keyboard
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int product=a*b;
		System.out.println(product);
		
		

	}

}
