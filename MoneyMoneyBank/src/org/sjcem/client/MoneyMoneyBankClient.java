//Driver class
//Program to demonstrate on MoneyMoneyBank App
package org.sjcem.client;

import org.sjcem.application.MMBankFactory;
import org.sjcem.application.MMCurrentAcc;
import org.sjcem.application.MMSavingAcc;
import org.sjcem.framework.BankFactory;
import org.sjcem.framework.CurrentAcc;
import org.sjcem.framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = b.getNewSavingAcc(1111, "Dishant Tare", 3000, true);
		CurrentAcc c = b.getNewCurrentAcc(2222, "Abhinav Rawat", 5000, 4500);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		
		
	}

}
