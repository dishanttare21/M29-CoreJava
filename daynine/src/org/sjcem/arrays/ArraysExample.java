//Program to demonstrate on single array
package org.sjcem.arrays;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int num = sc.nextInt();
		
		//array declaration
		int arr[] = new int[num];
		
		//array initialization
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		//for printing all array elements
		for(int itr: arr) {
			System.out.print(itr+" ");
		}
	}

}
