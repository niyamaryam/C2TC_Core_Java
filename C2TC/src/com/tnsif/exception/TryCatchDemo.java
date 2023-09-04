package com.tnsif.exception;

public class TryCatchDemo 
{
// object is not required 
	static void divide(int x, int y)//12,6
	{
		
		System.out.println("I am in divide method");
		int z;
		try {
			
			System.out.println("I am try block");
			z=x/y;
			System.out.println("Result is = "+z);
			
			}
		
		catch(ArithmeticException e) //inbuilt class
		{
			
			System.out.println("I am catch block...!!~~"+e.getMessage());
			// for printing gracefull message
			
		}
		
		finally
		{
			
			System.out.println("I am finally block");
			
			
		}
	}

}
