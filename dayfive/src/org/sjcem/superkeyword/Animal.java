//Program  to demonstrate super keyword
//parent class
package org.sjcem.superkeyword;

public class Animal {
	//private data members
	public String animalType = "Wild";
	public int noOfLegs = 2;
	
	public void display() {
		System.out.println("Animal type: "+animalType);
		System.out.println("No of Legs are: "+noOfLegs);
	}
	

	//toString() method
	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
	
	
}
