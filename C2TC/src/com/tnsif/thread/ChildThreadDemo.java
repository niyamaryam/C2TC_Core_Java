package com.tnsif.thread;

public class ChildThreadDemo implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	

}
