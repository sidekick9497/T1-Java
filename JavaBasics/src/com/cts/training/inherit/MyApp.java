package com.cts.training.inherit;

class Base{
	Base(){
		System.out.println("Default Cons. of Base");
	}
	Base(int a){
		System.out.println("Single Arg. Cons. of Base");
	}
	Base(int a, int b){
		System.out.println("Two Arg. Cons. of Base");
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("Default Cons. of Derived");
	}
	Derived(int a){
		System.out.println("Single Arg. Cons. of Derived");
	}
	Derived(int a, int b){
		super(a);
		System.out.println("Two Arg. Cons. of Derived");
	}
}



public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived D = new Derived(10, 20);
	}

}
