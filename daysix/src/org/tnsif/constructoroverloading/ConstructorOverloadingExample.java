//Program to demonstrate constructor overloading
package org.tnsif.constructoroverloading;

public class ConstructorOverloadingExample {
	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloadingExample() {
		System.out.println("Default constructor");
	}
	
	public ConstructorOverloadingExample(int x) {
		System.out.println("Parameterized constructor "+x);
	}
	
	public ConstructorOverloadingExample(int x, int y) {
		System.out.println("Parameterized constructor "+x+" "+y);
	}
}
