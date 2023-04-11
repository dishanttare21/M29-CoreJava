//Program to print the fibonacci series using recursion
package org.sjcem.assignmentFunctionRecursion;

import java.util.Scanner;

public class FibonacciUsingRecurion {
	
	//function definition
	static int fibonacci(int num)
	{
	    if (num == 0)
	    {
	        return 0; 
	    }
	    else if (num == 1)
	    {
	        return 1; 
	    }
	    else
	    {
	        return fibonacci(num - 1) + fibonacci(num - 2);
	    }
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(fibonacci(i)+" ");
	    }
		sc.close();
	}

}
