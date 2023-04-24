//Program to demonstrate method overloading
//driver class
package org.tnsif.methodoverloading;

public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		
		MethodOverloadingExample m = new MethodOverloadingExample();
		System.out.println(m.multiplication(12.5f, 3.0f));
		System.out.println(m.multiplication(1.5f, 4));
		System.out.println(m.multiplication(5, 15.2f));
		System.out.println(m.multiplication(2, 7));
		
		System.out.println(m.print("Welcome to C2TC"));
		System.out.println(m.print("Dishant", "Tare"));
	}

}
