//Program to demonstrate on filtering
package org.sjcem.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Dishant", "Lalit", "Abhinav", "Dishant");
		l.stream().filter(i -> i.length()>5).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		l.stream().distinct().forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		l.stream().limit(2).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		l.stream().skip(3).forEach(i -> System.out.print(i+" "));
		System.out.println();
	}

}
