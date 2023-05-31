//Program to demonstrate on Thread life-cycle
 
package org.sjcem.multithreading;

public class ThreadLifeCycle extends Thread{
	
	public void run()
	{
		System.out.println("Is thread alive?:"+this.isAlive());
		int x=0;
		while(x<3)
		{
			x++;//2
			System.out.println("X is: "+x);//3
			
		}
		
		try {
			sleep(500);
			System.out.println("Is thread alive?:"+this.isAlive());
			
		}
		catch(InterruptedException e) {
				System.out.println("Thread interrupted.....");
		
		}
	}

	public static void main(String[] args) {
		
		ThreadLifeCycle t = new ThreadLifeCycle();
		System.out.println("Before starting a thread: Is thred is alive?:"+t.isAlive());
		t.start();
		

	}

}
