package com.tnsif.polymorphism;

public class Executor {

	public static void main(String[] args) 
	{
		//method overloading
		
		System.out.println("\n!!Method Overloading!!\n");
		System.out.println("Addition of two integers = "+ MethodOverloading.addition(100, 120));
		System.out.println("Addition of two floating point numbers = "+ MethodOverloading.addition(100.0f, 120.0f));
		System.out.println("Addition of two float and int numbers = "+ MethodOverloading.addition(100.0f, 1200));
		System.out.println("Addition of two int and float numbers = "+ MethodOverloading.addition(170, 120.0f));
		System.out.println("Concatenation of strings = "+ MethodOverloading.addition("Niya " , "Maryam"));
		
		
		// constructor overloading
		
		System.out.println("\n!!Constructor Overloading!!\n");
		
		Coordinates p=new Coordinates();
		System.out.println(p);//default constructor
		
		Coordinates p1=new Coordinates(62.3f);
		System.out.println(p1);
		
		Coordinates p2=new Coordinates(10.3f,12.3f);
		System.out.println(p2);
		
		

	}

}
