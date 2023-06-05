package org.sjcem.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Raw list - heterogeneous
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(14);
		list.add(34.78);
		list.add(340088038324l);
		list.add(true);
		list.add('A');
		list.add("Mumbai");
		System.out.println(list);
		
		//Homogeneous
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Dishant");
		list2.add("Abhinav");
		list2.add("Suresh");
		//list2.add(true);
	}

}
