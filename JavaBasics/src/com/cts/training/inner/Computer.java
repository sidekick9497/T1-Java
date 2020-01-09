package com.cts.training.inner;

public class Computer {

	private String contents;
	
	static String registers; 
	
	private class MotherBoard{
		
	}
	
	static class DataCable{
		// can access only static members of outer class
		void transfer() {
			// contents ="";
			registers="";
		}
	}
	
	
	// Anonymous inner class
	
	class CPU{
		String contents;
		void process(String data) {
			String contents;
			// System.out.println("Processing");
			contents = data;  // local
			this.contents = data; // CPU
			Computer.this.contents = data; // Computer
			// function call 
			// this$0.contents = data;
		}
	}
	class Monitor{
		void display() {
			// System.out.println("Displaying");
			System.out.println(contents);
			// System.out.println(this$0.contents);
		}
	}
}
