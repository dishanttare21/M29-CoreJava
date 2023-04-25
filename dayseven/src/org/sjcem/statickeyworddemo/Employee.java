//Program to demonstrate static keyword
package org.sjcem.statickeyworddemo;

public class Employee {
	
	//non-static data members
	private int empId;
	private String empName;
	
	//static data members
	static String Companyname = "TCS";

	//default constructor
	public Employee() {
		super();
	}

	//parameterized constructor
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
