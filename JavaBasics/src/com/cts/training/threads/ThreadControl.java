package com.cts.training.threads;

class MThreadPro extends Thread{
	String name;
	volatile byte running;
	MThreadPro(String name){
		this.name = name;
		this.running = 0;
	}
	void startThread() {
		this.running = 1;
		this.start();
	}
	
	void suspendThread() {
		this.running = 2;
	}
	
	void resumeThread() {
		this.running = 1;
	}
	
	void terminateThread() {
		this.running = 0;
	}
	
	public void run() {
		int n = 1;
		while(this.running != 0) {
			while(this.running == 2);
			
			System.out.println(this.name  + " :" + n++);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}


public class ThreadControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThreadPro thread1 = new MThreadPro("Thread-1");
		MThreadPro thread2 = new MThreadPro("Thread-2");
		
		for(int i = 0; i <= 35; i++) {
			System.out.println("Main: " + i);
			
			if(i == 5) {
				System.out.println("First Thread started");
				thread1.startThread();
			}
			
			if(i == 10) {
				System.out.println("Second Thread started");
				thread2.startThread();
			}
			
			if(i == 15) {
				System.out.println("Both Threads suspended");
				thread1.suspendThread();
				thread2.suspendThread();
			}
			
			if(i == 20) {
				System.out.println("Second Thread resumed");
				thread2.resumeThread();
			}
			
			if(i == 25) {
				System.out.println("First Thread resumed");
				thread1.resumeThread();
			}
			
			if(i == 30) {
				System.out.println("Both Threads terminated");
				thread1.terminateThread();
				thread2.terminateThread();
			}
			try {
			Thread.sleep(100);
			}
			catch(InterruptedException ex) {
				
			}
		}
		
		System.out.println("Main Terminated");
	}

}



























