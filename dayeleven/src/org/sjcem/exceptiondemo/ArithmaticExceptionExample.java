//Program to demonstrate on Arithmatic Exception
package org.sjcem.exceptiondemo;

import java.util.Scanner;

public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//try block contains an exception code
		try {
			System.out.println(x/y);
		} 
		//Catch block handles an exception
		catch(Exception e) {
			System.out.println("Exception handled "+e);
		}
		//Finally block is always executed
		finally {
			System.out.println("Finally block is always excuted");
		}
	}

}
