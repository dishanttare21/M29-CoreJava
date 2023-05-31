package com.sjcem.threading;

public class AccountDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setId(101);
		acc.setName("Dishant");
		acc.setBalance(50000);
		System.out.println(Thread.currentThread());
		
		AccountThread t1 = new AccountThread(acc, 12000);
		AccountThread t2 = new AccountThread(acc, 27000);
		AccountThread t3 = new AccountThread(acc, 20000);
		AccountThread t4 = new AccountThread(acc, 10000);
		AccountThread t5 = new AccountThread(acc, 5000);
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(acc);
	}

}
