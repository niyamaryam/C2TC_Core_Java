package com.tnsif.collectionGenerics;

public class Student {
	
	private int rollNo;
	private String Name;
	private float per;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", per=" + per + "]";
	}
	
	
	

}
