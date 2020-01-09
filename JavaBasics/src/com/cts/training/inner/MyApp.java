package com.cts.training.inner;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer C1, C2;
		
		C1 = new Computer(); // empty
		C2 = new Computer(); // empty
		
		// want to add CPU in C1
		Computer.CPU cpu1 = C1.new CPU();
		// Computer$CPU cpu1 = new Computer$CPU(C1);
		
		
		cpu1.process("Hello"); // cpu1 is working for C1
		
		// want to add CPU in C2
		Computer.CPU cpu2 = C2.new CPU();
		cpu2.process("Bye"); // cpu2 is working for C2

		Computer.Monitor mn1 = C1.new Monitor();
		Computer.Monitor mn2 = C2.new Monitor();
		
		mn1.display(); // not using  C1 name
		mn2.display();
		
		Computer.Monitor mn11 = C1.new Monitor();
		mn11.display();
		
	}

}
