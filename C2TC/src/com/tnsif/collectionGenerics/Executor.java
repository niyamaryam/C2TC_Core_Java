package com.tnsif.collectionGenerics;

import java.util.ArrayList;

public class Executor {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList =new ArrayList<Student>();
		
		//first element
		Student s1=new Student(11,"Niya",101);
		studentList.add(s1);
		//second element
		Student s2=new Student(21,"Sumayya",100);
		studentList.add(s2);
		
		Student s3=new Student(31,"Moina",99);
		studentList.add(s3);
		
		Student s4=new Student(41,"umesa",88);
		studentList.add(s4);
		
		System.out.println(studentList);
		
	}

}
