package com.tnsif.mypack;
//import com.tnsif.pack.A;
//import com.tnsif.sub_pack.D;
public class B {

	public static void main(String[] args) {
		com.tnsif.pack.A obj=new com.tnsif.pack.A();
		com.tnsif.pack.C obj1=new com.tnsif.pack.C();
		com.tnsif.sub_pack.D obj2=new com.tnsif.sub_pack.D();
		obj.msg();
		obj1.msg();
		obj2.msg();
	}

}
