//Program to demonstrate on Object Class
package org.sjcem.objectclassdemo;

class Sample {
	
}

class Demo {
	//constructor
	Demo() {
		//resource allocate
		System.out.println("Inside Constructor");
	}
	
	protected void finalize() {
		System.out.println("In finalize method");
	}
}


public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d = new Demo();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		
		/* Object class is used when you want to refer to an Object 
		 * whose data-type you don't know */
		Object obj = new Object();
		System.out.println(obj.getClass());
	}

}
