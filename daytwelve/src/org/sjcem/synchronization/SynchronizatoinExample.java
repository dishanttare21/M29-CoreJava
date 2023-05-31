package org.sjcem.synchronization;

public class SynchronizatoinExample {

	public static void main(String[] args) {
		Power obj = new Power();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		t1.start();
		t2.start();

	}

}
