//Program  to demonstrate super keyword
//child class
package org.sjcem.superkeyword;

public class Tiger extends Animal {
	//private data members
	public String animalType = "Tiger-Wild";
	public int noOfLegs = 4;
	
	public void display() {
		//super keyword with methods
		super.display();
		
		//super keyword with variables
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal type: "+animalType);
		System.out.println("No of Legs are: "+noOfLegs);
	}

	//toString() method
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
}
