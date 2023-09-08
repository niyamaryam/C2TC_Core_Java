package com.tnsif.thread;

public class ThreadLifeCycleDemo extends Thread{
	
	public void run()
	{
		System.out.println("inside run() thread is alive or not??"+this.isAlive());
		
		int num=0;
		while(num<4)
		{
			num++;
			System.out.println("num="+num);
			try {
				sleep(3000);
				System.out.println(this.isAlive());//in which state thread is alive
			} catch (InterruptedException e) {
				System.err.println("Thread interrupted...");
			}
		}
	}

	public static void main(String[] args) {
		
		Thread myThread=new ThreadLifeCycleDemo();
		System.out.println("before runnable state thread is alive or not?"+myThread.isAlive());
		myThread.start();
		try {
			//static
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted...");
		}
		System.err.println("terminate state of thread life cycle...alive or not?"+myThread.isAlive());
	}

}
