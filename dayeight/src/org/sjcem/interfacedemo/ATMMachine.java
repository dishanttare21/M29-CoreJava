//
package org.sjcem.interfacedemo;

public interface ATMMachine {
	
	/*By default all the variables inside an interface are 
	 * public static final */
	
	//here amount is of final type therefore it must be initialized
	int amountWithdraw = 1250;
	int amountDeposit = 2000;
	
	/*By default all the methods inside an interface are 
	 * public abstract*/
	void withdraw();
	void deposit();
}
