package org.sjcem.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Dishant");
		list.add("Abhinav");
		list.add("Manish");
		list.add("Suresh");
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("Dishant"));
		System.out.println(list.remove("Suresh"));
		System.out.println(list.remove("Ramesh"));
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		//System.out.println(list.remove(11));
		list.clear();
		
	}

}
