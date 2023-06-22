package org.sjcem.entities;

public class Student {

	//private data members
	private int rollno;
	private String name;
	
	//default constructor
	public Student() {
		
	}
	
	//Parameterized Constructor
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//toString method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
