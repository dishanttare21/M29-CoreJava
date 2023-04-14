//Program  to demonstrate super keyword
//driver class
package org.sjcem.superkeyword;

public class SuperExecuter {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.display();
		
		//it will access child class properties
		System.out.println(t);
	}

}
