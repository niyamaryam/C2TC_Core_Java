package com.tnsif.strings;

public class StringDemo {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Maryam");
		s.append(" Niya");
		System.out.println(s);
		
		String str="SANKIRTHANA";
		
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		System.out.println(str.substring(2));
		//included 2 excluded 10 char
		System.out.println(str.substring(2, 10));
		System.out.println(str.equals("sankirthana"));//content comparision
		System.out.println(str.equalsIgnoreCase("sankirthana"));
		System.out.println(str.replace('A', 'S'));//s replaces with A 
	}

}
