package org.sjcem.synchronization;

public class ThreadTwo extends Thread{
	Power p;
	//parameterized constructor
	public ThreadTwo(Power p) {
		super();
		this.p = p;
	}
	public void run()
	{
		p.printPower(2);
	}

}
