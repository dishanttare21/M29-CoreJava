//Program to demonstrate hierarchical inheritance
//child class 2
package org.sjcem.hierachicalinheritance;

public class Tiramisu extends Android {
	
	//private variables
	private int versionName;
	private String modelName;
	
	//Default constructor
	public Tiramisu() {
		System.out.println("Default constructor for child class 2");
	}
	
	//Parameterized constructor
	public Tiramisu(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	
	//getters and setters
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	//toString() method
	@Override
	public String toString() {
		return "Tiramisu [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}

}
