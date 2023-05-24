//Program to demonstrate ib Multiple catch block
package org.sjcem.exceptiondemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		//array declaration and initialization
		int arr[] = {101, 33, 78};
		System.out.println("Array is: ");
		
		
		try {
			System.out.println(arr[3]);
		} 
		/*We can use multiple catch block*/
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled "+e);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception handled "+e);
		}*/
		
		/* We can pass multiple exception name inside same catch block */
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		}
		
		
			
	}

}
