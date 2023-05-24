//Program to demonstrate on throw and throws keywords
package org.sjcem.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordExample {
	
	/*throws keyword is used to declare an exception*/
	public static void donate(int age, int weight) throws IOException {
		if(age>18 && weight>50)
			System.out.println("Person is eligible to donate blood");
		else
			/*throws keyword is used to throw an exception explicitly*/
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) {
		try {
			donate(14, 52);
		} catch (IOException e) {
			System.out.println("Exception handled"+e);
		}
			
	}

}
