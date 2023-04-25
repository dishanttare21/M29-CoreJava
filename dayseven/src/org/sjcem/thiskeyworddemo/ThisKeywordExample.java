//program to demonstrate this keyword
package org.sjcem.thiskeyworddemo;

public class ThisKeywordExample {
	//private data members
	private int cvvNo;
	private long atmNo;
	
	public ThisKeywordExample(int cvvNo, long atmNo) {
		/*this keyword is used to  refer the instance class variable of current class*/
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}
	
	public void print() {
		System.out.println("CVV: "+cvvNo+" ATM No."+atmNo);
	}
}
