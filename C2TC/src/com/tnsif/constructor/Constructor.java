package com.tnsif.constructor;

public class Constructor {
	private String ConstructorName;
	private int ConstructorAge;
	private String ConstructorCity;
	private String getConstructorName;
	public String getConstructorName() {
		return ConstructorName;
	}
	public int getConstructorAge() {
		return ConstructorAge;
	}
	public void setConstructorAge(int constructorAge) {
		ConstructorAge = constructorAge;
	}
	public String getConstructorCity() {
		return ConstructorCity;
	}
	public void setConstructorCity(String constructorCity) {
		ConstructorCity = constructorCity;
	}
	public String getGetConstructorName() {
		return getConstructorName;
	}
	public void setGetConstructorName(String getConstructorName) {
		this.getConstructorName = getConstructorName;
	}
	public void setConstructorName(String constructorName) {
		ConstructorName = constructorName;
	}
	
	//parametarized constructor
	
	public Constructor (String ConstructorName, int ConstructorAge, String ConstructorCity) {
	super();
	this.ConstructorName = ConstructorName;
	this.ConstructorAge = ConstructorAge;
	this.ConstructorCity = ConstructorCity;
	
}
//no agrs constructors
public Constructor()
{
	System.out.println("im default constructor");
	
}
	
}




