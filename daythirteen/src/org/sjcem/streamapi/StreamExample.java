//Program to demonstrate on stream
package org.sjcem.streamapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(11, 26, 20, 56, 75);
		System.out.println(s1);
		s1.forEach(i -> System.out.print(i+" "));
	}

}
