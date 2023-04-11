package org.sjcem.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
	//object creation
	HDFCBank h=new HDFCBank();
	h.setCardNo(234567234L);
	h.setCardType("Debit-card");
	h.setCVVNo(444);
	h.setPinNo(1001);
	
	//getters is used to return value
	System.out.println(h.getCardNo());
	System.out.println(h.getCardType());
	System.out.println(h.getCVVNo());
	System.out.println(h.getPinNo());

	}

}