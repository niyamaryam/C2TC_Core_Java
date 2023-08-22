package com.tnsif.access;

public class Base 
{//variables attribute properties
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//methods behaviour
	
	void methodDefault()
	{
		System.out.println("Default access base class");
		System.out.println(varDefault);
		
	}
	
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println(varPublic);
		
	}
	
	
	private void methodPrivate()
	{
		System.out.println("Private access base class");
		System.out.println(varPrivate);
		
	}
	
	
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println(varProtected);
		
	}
	
	
}
