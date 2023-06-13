package org.sjcem.thiskeyworddemo;

public class Solution {

	public static void main(String[] args) {
		int a = 0;
		try {
			System.out.println(10/0);
			System.out.println("hello");
		} catch(Exception e) {
			System.out.println("world");
		}
		
	}

}
