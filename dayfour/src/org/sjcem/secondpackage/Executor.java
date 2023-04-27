package org.sjcem.secondpackage;

//way to import another package
import org.sjcem.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();
		
		/*If method is default we cannot access in another 
		package, only access in the same package*/
		//b1.methodDefault();
		
		b1.methodPublic();
	}

}
