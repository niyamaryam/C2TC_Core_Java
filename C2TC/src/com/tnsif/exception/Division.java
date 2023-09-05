package com.tnsif.exception;
//multiple chatch exception
import java.util.*;

public class Division {
	
	static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			
			System.out.println("Result is ="+c);
		}
		catch(InputMismatchException e)//specific or child class
		{
			System.out.println("Invalid input. please enter integers only");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception cought.."+e.getMessage());
		}
		catch(Exception e)//generic or parent
		{
			System.out.println("Exception cought.."+e.getMessage());
		}
		finally
		{
		System.out.println("i will execute...do whatever you want...");
		}
	}

}
