package com.cts.training.initializers;


class Sample{
	
	static int n;
	int m;
	
	{ // instance initializer block
		System.out.println("Inside instance block");
	}
	
	Sample(){
		System.out.println("Inside constructor");
	}
	
	static {
		System.out.println("Inside static block");
		n = 20;
		// m = 30;
	}
	
	static {
		System.out.println("Static block part -2");
	}
}

public class MyApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// explicit way of loading the class
		// Class.forName("com.cts.training.initializers.Sample");
		
		
		// Sample.n = 10;
		
		System.out.println("MyApp Started");
		Sample S1;
		System.out.println("After reference");
		S1 = new Sample();
		System.out.println("After object");
		Sample S2 = new Sample();
		
	}

}






























