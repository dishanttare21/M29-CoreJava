//Program to demonstrate on when finally block is not executed
package org.sjcem.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		//array declaration and initialization
		int arr[] = {101, 33, 78};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
			/* 1. When we call System.exit(0) means no any further statement is executed */
			//System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception handled "+e);
		} finally {
			/* 2. When Finally block contains exception code */
			System.out.println(13/0);
			System.out.println("Finally block");
		}
	}

}
