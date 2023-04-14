//Program to demonstrate hierarchical inheritance
//parent class
package org.sjcem.hierachicalinheritance;

public class Android {
	
	//private data members
	private String brand;
	private String ownerName;
	
	//Default constructor
	public Android() {
		System.out.println("Default Constructor for parent");
		brand = "Realme";
		ownerName = "Li BingZhong";
	}
	
	//Parameterized constructor
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}

	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
	
}
