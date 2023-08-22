package com.tnsif.classes;

class Student {
	 String name;
	 int age;
	 int roll;
}
			
class Sample {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="Maryam";
		s1.age=20;
		s1.roll=320;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.roll);
	}
}
	
