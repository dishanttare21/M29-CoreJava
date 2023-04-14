//Program to demonstrate hierarchical inheritance
//child class 1
package org.sjcem.hierachicalinheritance;

public class SnowCone extends Android {
	private int versionName;
	private String modelName;
	
	//Default constructor
	public SnowCone() {
		System.out.println("Default constructor for child class 1");
	}
	
	//Parameterized Constructor
	public SnowCone(int versionName, String modelName) {
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
		return "SnowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	
}
