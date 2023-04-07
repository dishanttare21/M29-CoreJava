//Program to count the number of digits of a given number(HW)
package org.sjcem.looping;

import java.util.Scanner;

public class NumberOfDigitsProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		do {
			count += 1;
			num = num/10;
 		}while(num > 0);
		System.out.println("No of digits: "+count);
	}

}
