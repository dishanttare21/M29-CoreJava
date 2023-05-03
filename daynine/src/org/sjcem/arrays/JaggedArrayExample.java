//program to demonstrate on jagged array
package org.sjcem.arrays;

import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {
		
		//in jagged array inside array elements are different
		int arr[][] = new int[2][];
		
		//first row has 3 columns
		arr[0] = new int[3];
		
		//second row has 2 columns
		arr[1] = new int[2];
		
		//initializing array
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		//Displaying  the elements
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
