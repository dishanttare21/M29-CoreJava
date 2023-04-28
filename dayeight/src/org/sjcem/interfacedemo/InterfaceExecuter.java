package org.sjcem.interfacedemo;

public class InterfaceExecuter {

	public static void main(String[] args) {
		/*We cannot instantiate an interface because all methods are abstract*/
		//ATMMachine a = new ATMMachine();
		
		//Lazy initialization
		ATMMachine a = new ATMMachineChild();
		a.withdraw();
		a.deposit();
	}

}
