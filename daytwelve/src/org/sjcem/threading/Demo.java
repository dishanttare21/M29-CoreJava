package org.sjcem.threading;

public class Demo {

	public static void main(String[] args) {
		
		 Person p = new Person(); 
		 p.setId(101); 
		 p.setName("Dishant");
		 ChildThread t1=new ChildThread(p); 
		 ChildThread t2=new ChildThread(p);
	}

}
