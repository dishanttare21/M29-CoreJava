package org.sjcem.arrays;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		// array initialization
		int array[] = {1, 2, 3, 4, 5};
		
		//using Arrays class we print all the array elements
		System.out.println(Arrays.toString(array));
		
		//sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
