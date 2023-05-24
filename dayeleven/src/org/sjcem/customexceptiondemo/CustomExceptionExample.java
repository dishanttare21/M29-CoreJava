package org.sjcem.customexceptiondemo;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) throws LoginCredential {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username and password");
		String id = sc.nextLine();
		String password = sc.nextLine();
		
		try {
			if(id.equals("taredishant21@gmail.com") && password.equals("ABC123"))
				System.out.println("Credentials matched");
			else
				throw new LoginCredential("Invalid Credentials");
		}
		/*handling using user-defined exception*/
		catch (LoginCredential e) {
			System.out.println("Exception handled "+ e);
		}
	}

}
