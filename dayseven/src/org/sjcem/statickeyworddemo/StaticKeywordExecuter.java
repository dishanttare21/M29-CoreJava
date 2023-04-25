//Program to demonstrate static keyword
//driver class
package org.sjcem.statickeyworddemo;

public class StaticKeywordExecuter {

	public static void main(String[] args) {
		/* Without creating the object we will get the value for static variable */
		System.out.println(Employee.Companyname);
		
		
		Employee e = new Employee(101, "Dishant Tare");
		System.out.println(e);
		
		Employee e1 = new Employee(102, "Abhinav Rawat");
		System.out.println(e1);
		
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
	}

}
