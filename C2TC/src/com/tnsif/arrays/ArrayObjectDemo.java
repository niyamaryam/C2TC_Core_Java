package com.tnsif.arrays;

//store objects in the form of arrays

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		Student[] arr=new Student[5];
		
		arr[0]=new Student(1,"Niya");
		arr[1]=new Student(2,"Jiya");
		arr[2]=new Student(3,"Piya");
		arr[3]=new Student(4,"Riya");
		arr[4]=new Student(5,"Diya");
		
		for(int i=0;i<arr.length;i++)
			System.out.println("Element at "+i+"="+arr[i].getRollno()+" "+arr[i].getName());
		

	}

}
