//Program to demonstrate user-defined exception
package org.sjcem.customexceptiondemo;

/*To create a custom exception we need to extend the Exception class*/
public class LoginCredential extends Exception {
	
	//Private data member
	private  String str1;
	
	//Parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1 = str1;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}

}
