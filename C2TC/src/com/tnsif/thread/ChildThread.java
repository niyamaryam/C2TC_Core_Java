package com.tnsif.thread;

public class ChildThread extends Thread// technique 1
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" I am child thread");
		}
	}
	
}
