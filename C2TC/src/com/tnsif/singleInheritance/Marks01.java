package com.tnsif.singleInheritance;

public class Marks01 extends Student01
{
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void printMe() {
		System.out.println("Im in a child class!!!");
		super.printYou();//use base class method by using super keyword
	}
	
	
	
	
	

}
