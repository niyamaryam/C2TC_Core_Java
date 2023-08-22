package com.tnsif.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		//method 1
		Constructor c1=new Constructor();
		System.out.println("enter details");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		String city=sc.nextLine();
		
		c1.setConstructorName(name);
		c1.setConstructorAge(age);
		c1.setConstructorCity(city);
		
		//System.out.println(c1.getConstructorName());
		//System.out.println(c1.getConstructorAge());
		//System.out.println(c1.getConstructorCity());
		
		//method 2 using constructor
		
		c1=new Constructor(name,age,city);
		System.out.println(c1.getConstructorName());
		System.out.println(c1.getConstructorAge());
		System.out.println(c1.getConstructorCity());
		System.out.println("parameterized exe");
		sc.close();

	}

}
