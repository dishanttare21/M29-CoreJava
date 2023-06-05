package org.sjcem.collections.list;

public class Person {

	private int id;
	private String Name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + "]";
	}
	

}
