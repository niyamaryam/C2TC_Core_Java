package com.tnsif.logic;
import java.util.Scanner;

public class PrimeN2 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your number:");
			int x=s.nextInt();
			
			boolean is_p=true;
			for(int y=2;y<=10;y++) {
				if(x%y==0) {
					is_p=false;
					break;
				}
			}
			if(is_p==true) {
				System.out.println(x+" is a prime number!!");
			}
			else
			{
				System.out.println(x+" is not a prime number!!");	
			}
	}

}
