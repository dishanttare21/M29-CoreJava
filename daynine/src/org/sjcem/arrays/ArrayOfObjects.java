package org.sjcem.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// array of customer class
		Customer arr[] = new Customer[2];
		
		arr[0] = new Customer(12345, "Dishant");
		arr[1] = new Customer(23456, "Abhinav");
		
		for(Customer c: arr) {
			System.out.println(c.getId()+" "+c.getName());
		}
	}

}
