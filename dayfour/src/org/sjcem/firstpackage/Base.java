//Program to demonstrate on packages and access specifiers
package org.sjcem.firstpackage;

public class Base {
	/*Declaring all the access specifiers with variable*/
	int varDefault = 10;
	public String varPublic = "Dishant";
	private int varPrivate = 1234;
	protected float varProtected = 34.00f;
	
	/*Declaring all the access specifiers with methods*/
	void methodDefault() {
		System.out.println("Default access method "+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("Public access method "+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Private access method "+varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("Protected access method "+varProtected);
	}
}
