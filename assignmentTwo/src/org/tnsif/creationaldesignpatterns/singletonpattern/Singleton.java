package org.tnsif.creationaldesignpatterns.singletonpattern;

public class Singleton {
	/* Eager Initialization - instance created even if not used */
	//private static Singleton INSTANCE = new Singleton();
	
	private static Singleton INSTANCE = null;
	
	private Singleton() {
		
	}
	
	/* static block initialization */
//	static {
//		try {
//			if(INSTANCE ==null) {
//				INSTANCE = new Singleton();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	/*Lazy Initialization*/
	public static Singleton getInstance() {
		if(INSTANCE ==null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
		
	}
}


