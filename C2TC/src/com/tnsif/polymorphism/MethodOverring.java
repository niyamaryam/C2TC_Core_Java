package com.tnsif.polymorphism;

public class MethodOverring {

	public static void main(String[] args) {
		Rbi r;
		r=new Sbi();
		System.out.println(r.rateOfInterest());
		
		r=new Hdfc();
		System.out.println(r.rateOfInterest());
		
		r=new Icici();
		System.out.println(r.rateOfInterest());
		

	}

}
