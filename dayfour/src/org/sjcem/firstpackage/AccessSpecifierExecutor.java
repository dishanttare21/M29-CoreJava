//Driver class
//program to demonstrate on packages, access specifiers and instanceof operator
package org.sjcem.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		
		/*Private access specifiers we cannot access in another class*/
		//b.varPrivate;
		//b.methodPrivate();
		
		//instanceof operator
		System.out.println(b instanceof Base);
	}

}
