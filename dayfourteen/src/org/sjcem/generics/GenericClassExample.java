//Program to demonstrate on Generic class
package org.sjcem.generics;

//generic class
class GenericClass<T> {
	
	T x;
	void print(T x) {
		this.x = x;
	}
	
	T accept() {
		return x;
	}

}

//driver class
public class GenericClassExample{
	public static void main(String[] args) {
		GenericClass<Character> obj = new GenericClass<>();
		obj.print('S');
		System.out.println(obj.accept());
	}
}
