package com.tnsif.logic;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int res=0;
		while(temp>0) {
			int id=temp%10;
			res=res+id*id*id;
			temp=temp/10;
		}
	
	if(res==n) {
		System.out.println("number is armstrong:");
		}
	else {
		System.out.println("number is not armstrong:");
	}
	
}
}
