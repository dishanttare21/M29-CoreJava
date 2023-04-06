//Program to demonstrate increment and decrement operator
package org.sjcem.operatordemo;

public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		int a=12,b=5,c=3;
		int x = a++;
		++a;
		--b;
		int y = b--;
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		System.out.println(y);
	}

}