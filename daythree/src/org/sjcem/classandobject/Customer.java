package org.sjcem.classandobject;

public class Customer {
	
	//private data members
	private int customerId;
	private String customerName;
	private String city;
	
	
	/*Constructor does not have any return type
	it is same as classname followed by '()'*/
	
	//default constructor
	public Customer() {
		super();
	}
	
	//Parameterized constructor
	public Customer(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}
	
	/*to access private data members from another class use getters and setters*/
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//Object of a class will toString() method
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}
	
}
