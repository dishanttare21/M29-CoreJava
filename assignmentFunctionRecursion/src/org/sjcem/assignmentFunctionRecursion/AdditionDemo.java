//To demonstrate an example on function
package org.sjcem.assignmentFunctionRecursion;

import java.util.Scanner;

public class AdditionDemo {
	
	//Function Definition
	static void addition(int x, int y) {
		int sum = x+y;
		System.out.println("the sum is: "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//Function call
		addition(x, y);
		sc.close();
	}

}
