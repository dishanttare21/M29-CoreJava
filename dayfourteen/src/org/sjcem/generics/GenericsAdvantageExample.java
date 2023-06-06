//Program to demonstrate on Generics advantage
package org.sjcem.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		//1. Type-safety
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		//list.add(23.4);
		System.out.println(list);
		
		//2. Before Generics, Typecasting is allowed/necessary
		ArrayList arr1 = new ArrayList<>();
		arr1.add("St. John");
		System.out.println(arr1);
		String str = (String) arr1.get(0);
		System.out.println(str);
		
		//3. In Generics, Typecasting is not necessary
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("St. John");
		System.out.println(arr2);
		String str1 = arr2.get(0);
		System.out.println(str1);
	}

}
