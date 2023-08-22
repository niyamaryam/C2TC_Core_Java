package com.tnsif.arrays;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr= {15,89,45,15,75,35,11,10,9};
		System.out.println("Entered array is =");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		Arrays.sort(arr);
		
    System.out.println("sorted array is =");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		
		System.out.println("Length of the array arr is = "+arr.length);//len variable

	}

}
