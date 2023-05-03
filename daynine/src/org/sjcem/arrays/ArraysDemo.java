//Program to demonstrate on single array
package org.sjcem.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// compile time
		int arr[] = {12,6, 90, 67};
		
		/*if we access the 4th index we will get an exception
		 * as "ArrayIndexOutOfBounds" */
		//System.out.println(arr[4]);
		
		System.out.println("Element at 2nd index is: "+arr[2]);
		
		//for printing all the elements
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
