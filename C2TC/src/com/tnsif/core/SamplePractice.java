package com.tnsif.core;

public class SamplePractice {

	public static void main(String[] args) {
		int x=0;
		do
		{
			x++;
			System.out.println(x);
			if(++x<5)//2
				continue;
			x++;
			System.out.println(x);
			
		}while(++x<10);//whnever continue 
	}

}
