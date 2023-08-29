package com.tnsif.singleInheritance;

import java.util.Scanner;

class A
{
	int a , b ;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number 1: ");
		a = sc.nextInt();
		
		System.out.println("Enter The Number 2: ");
		b = sc.nextInt();
		
	}
	
	void add()
	{
		System.out.println("Addition Of Two Numbers: " + (a+b));
	}
}


class B extends A
{
	int c;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter The Number 3: ");
		c = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Addition Of Three Numbers: " + (a+b+c));
	}
}



public class SingleAddEx {

	public static void main(String[] args) {
		
		//access all the method with B class obj
		
		B nm = new B();
		nm.input();
		nm.add();
		nm.getData();
    	nm.display();
		

	}

}
