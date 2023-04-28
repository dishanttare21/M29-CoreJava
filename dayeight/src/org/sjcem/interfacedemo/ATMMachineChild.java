package org.sjcem.interfacedemo;

public class ATMMachineChild implements ATMMachine {

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount is: "+amountWithdraw);
	}

	@Override
	public void deposit() {
		System.out.println("Deposit amount is: "+amountDeposit);
	}

}
