//Program to demonstrate While Loop
package org.sjcem.looping;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		// Print 1 to N numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		int i=1;
		while(i <= N) {
			System.out.print(i+ " ");
			i++;
		}
	}

}
