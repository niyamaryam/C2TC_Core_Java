package com.tnsif.singleInheritance;

public class Student01 
{
	private int roll;
	private String name;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void printYou() {
		System.out.println("Im in a Base class!!!");
	}

}
