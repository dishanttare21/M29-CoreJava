//Program to find the sum of digits of a number using recursion
package org.sjcem.assignmentFunctionRecursion;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {

	static int sumOfDigits(int num) {
		if(num == 0)
			return 0;
		return num%10+sumOfDigits(num/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The sum of digits of the number is: "+sumOfDigits(num));
		sc.close();
	}

}
