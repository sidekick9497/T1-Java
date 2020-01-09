package com.cts.training.threads;

public class MyApp {

	public static void main(String[] args) {
		MThread thread = new MThread();
		
		// want to launch thread
		thread.start();

		for(int i = 1;i<=100;i++) {
			System.out.println("Main :" + i);
		}
		// wait for termination of child thread
		try {
			thread.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("Main Terminated");
	}

}
