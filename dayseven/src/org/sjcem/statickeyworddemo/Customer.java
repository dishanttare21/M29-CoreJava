//Program to demonstrate static block and static method
package org.sjcem.statickeyworddemo;

public class Customer {
	//non-static data members
	private int custId;
	
	//static data members
	private static String companyName;
	
	
	//static-block
	/* static block is used to initialize static variable only */
	static {
		/* we cannot use non-static variable inside the static block */
		//custId=101;
		
		companyName = "Myntra";
	}
	
	
	public Customer() {
		custId++;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	static void display() {
		/* We can't use non static variable in static method */
		//System.out.println("Customer Id: "+custId+" );
		System.out.println("CompanyName: "+companyName);
	}
	
	
}
