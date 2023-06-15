package org.sjcem.application;

import org.sjcem.framework.BankFactory;
import org.sjcem.framework.CurrentAcc;
import org.sjcem.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return c;
	}

}
