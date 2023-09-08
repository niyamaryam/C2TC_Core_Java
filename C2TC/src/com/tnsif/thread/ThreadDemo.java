package com.tnsif.thread;
//demo on creating threads using thread class....
public class ThreadDemo {

	public static void main(String[] args) {
//		ChildThread c=new ChildThread();//new state
//		c.start();//runnable state
		ChildThreadDemo t=new ChildThreadDemo();
		
		
		Thread d=new Thread(t);
		d.start();//start your thread
		for(int i=0;i<10;i++)
		{
			System.out.println("I am main thread");
		}

	}

}
