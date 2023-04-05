//Program to demonstrate user input
package org.sjcem.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter your salary: ");
		float salary = sc.nextFloat();
		System.out.println("Salary is: "+salary);
		
		System.out.println("Enter your name: ");
		//next() is used to get first word of your sentence
		String name = sc.next();
		sc.nextLine();
		System.out.println("Name is: "+name);
		
		System.out.println("Enter your full name: ");
		//nextLine() is used to get entire sentence
		String full_name = sc.nextLine();
		System.out.println("Name is: "+full_name);
		
		sc.close();
	}

}
