//Program to demonstrate to create a thread by implementing a runnable interface
package org.sjcem.multithreading;
public class MyRunnableThread implements Runnable {
	
	public void run() {
		System.out.println("Thread is in the running state");
	}

	public static void main(String[] args) {
		MyRunnableThread t = new MyRunnableThread();
		t.run();

	}

}
