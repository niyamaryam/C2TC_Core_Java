package com.tnsif.hierarchicalInheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		Person p=new Person("Dhruv", "Mumbai");
		if(p instanceof Person)
			System.out.println("Person details ="+p);
		
		p=new Employee("Nikhil","Mumbai", 320, 70000, "sales");
		if(p instanceof Employee)
			System.out.println("Employee details ="+p);
		
		p=new Student("Pankaj", "pune", "BE", 90);
		if(p instanceof Student)
			System.out.println("Student details ="+p);
		
	}

}
