package org.sjcem.classandobject;

import java.util.Scanner;

//driver class
public class ConstructorDemo {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("Enter the customer ID:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the customer name:");
		name=sc.nextLine();
		
		System.out.println("Enter the customer city:");
		city=sc.nextLine();
		
		//object creation
		//default constructor invoke
		Customer c = new Customer();
		c.setCustomerName(name);
		c.setCustomerId(id);
		c.setCity(city);
		//below statement will call to toString method
		System.out.println(c);
		
		
		System.out.println("Enter the customer ID:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the customer name:");
		name=sc.nextLine();
		
		System.out.println("Enter the customer city:");
		city=sc.nextLine();
		
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);
	}

}