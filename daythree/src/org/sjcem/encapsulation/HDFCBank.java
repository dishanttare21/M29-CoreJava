package org.sjcem.encapsulation;


public class HDFCBank {
	//private data members
	private long cardNo;
	private String cardType;
	private int CVVNo;
	private int pinNo;
	
	//getters and setters
	public long getCardNo() {
	return cardNo;
	}
	public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
	}
	public String getCardType() {
	return cardType;
	}
	public void setCardType(String cardType) {
	this.cardType = cardType;
	}
	public int getCVVNo() {
	return CVVNo;
	}
	public void setCVVNo(int cVVNo) {
	CVVNo = cVVNo;
	}
	public int getPinNo() {
	return pinNo;
	}
	public void setPinNo(int pinNo) {
	this.pinNo = pinNo;
	}
	@Override
	public String toString() {
	return "HDFCBank [cardNo=" + cardNo + ", cardType=" + cardType + ", CVVNo=" + CVVNo + ", pinNo=" + pinNo + "]";
	}
	
}