//Program to demonstrate For Loop
package org.sjcem.looping;

import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		// Print 1 to N numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.print(i+ " ");
		}

	}

}
