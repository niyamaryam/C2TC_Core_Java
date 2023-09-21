package com.tnsif.interfaces.multipleInheritance;

public class ExtendingInterfaceDemo implements ChildInterface {

	@Override
	public void print() {
		System.out.println("i am coming from InterfaceOne!!!");
	}
	

	@Override
	public void show() {
		System.out.println("i am coming from ChildInterface!!!");
	}
	
	
	

}
