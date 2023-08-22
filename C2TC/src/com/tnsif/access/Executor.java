package com.tnsif.access;

public class Executor {

	public static void main(String[] args) {
		//obj ob base class
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//private is not access
		//change the value also
		b1.varDefault=11;
		b1.methodDefault();

	}

}
