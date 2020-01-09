package com.cts.training.inherit;

final class Sample{
	
}

abstract class BasePro{
	public int a;
	final int  n = 10; // constant 
	abstract public void fun();
	
 	
	final void trial() { // cannot be overridden
		
	}
	
	/*public void fun() {
		System.out.println("Inside fun function of Base");
	}*/
}

class DerivedPro extends BasePro{
	public int b;
	public void fun() {
		System.out.println("Inside fun of Derived");
	}
	public void test() {
		System.out.println("Inside test of Derived");
	}
}

abstract class DerivedEx extends BasePro{
	public int b;
	/*public void fun() {
		System.out.println("Inside fun of DerivedEx");
	}*/
	public void test() {
		System.out.println("Inside test of Derived");
	}
}

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DerivedPro D = new DerivedPro();
		D.a = 10;
		D.b = 20;
		D.fun();
		D.test();*/
		
		BasePro B = new DerivedEx();
		B.a = 10;
		// B.b = 20;
		B.fun();
		// B.test();
		
		
		
	}

}
