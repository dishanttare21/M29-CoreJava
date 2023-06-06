//Program to demonstrate on mapping
package org.sjcem.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Dishant", "Lalit", "Amit");
		l.stream().map(i -> i.length()).forEach(i -> System.out.print(i+" "));
	}

}
