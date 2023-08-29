package com.tnsif.singleInheritance;

import java.util.Scanner;

public class Super01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Roll Number: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		
		Marks01 m = new Marks01();
		m.setName(name);//setting the values "mutable"
		m.setRoll(roll);
		m.setMarks(marks);
		
		m.printMe();
//		m.printYou();
		
		System.out.println("\nStudent Information: ");//getting the value "access"
		System.out.println("Name: " + m.getName());
		System.out.println("Roll: " + m.getRoll());
		System.out.println("Marks: " + m.getMarks());
		

	}

}
