//A program to demonstrate factorial of a number using function
package org.sjcem.assignmentFunctionRecursion;

import java.util.Scanner;

public class factorialUsingFunction {
	
	static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of the number is: "+factorial(num));
		sc.close();
	}

}
