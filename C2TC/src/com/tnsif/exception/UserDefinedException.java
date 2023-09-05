package com.tnsif.exception;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age: ");
		
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		//cantvote
		
		if(age<18)//throw is use to pass the obj of exception class to the jvm
		{
			throw new CantVote("you cant vote as you are not eligible....");
		}
		else
		{
			System.out.println("you can happily vote....");
		}
	}
}
	
class CantVote extends RuntimeException
{
	
	CantVote(String msg)
	{
		super(msg);  //printstackmethod to print msg
	}
		

}
