//Program to demonstrate multi-level inheritance
//Driver class
package org.sjcem.multilevelinheritance;

public class MultiLevelInnheritanceExecuter {

	public static void main(String[] args) {
		City c = new City();
		c.setCityName("Mumbai");
		c.setArea("Krishna Nagar");
		c.setStateName("Maharastra");
		c.setLanguage("Marathi");
		c.setCountryName("India");
		c.setCountryCapital("Delhi");
		
		System.out.println(c);
	}

}
