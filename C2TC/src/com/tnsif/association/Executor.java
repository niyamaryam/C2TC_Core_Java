package com.tnsif.association;
//main class 
public class Executor {

	public static void main(String[] args) {
		Address address=new Address("KalaPather","Hyderabad","TS","5000064");
		
		//pass a object of address class
		
		Person person=new Person("Maryam",address);
		
		person.displayInfo();
	}

}
