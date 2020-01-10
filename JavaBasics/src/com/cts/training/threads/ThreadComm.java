package com.cts.training.threads;

class Box{
	private int count;
	Box(){
		this.count = 0;
	}
	
	void put() {
		this.count++;
		System.out.println("Produced : " + this.count);
	}
	void get() {
		this.count--;
		System.out.println("Consumed : " + this.count);
	}
}

class Producer extends Thread{
	Box box;
	volatile boolean running;
	Producer(Box box) {
		this.box = box;
		this.running = false;
	}
	
	void startThread() {
		this.running = true;
		this.start();
	}
	
	void terminateThread() {
		this.running = false;
	}
	
	public void run() {
		while(this.running) {
			
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				
			}
			this.box.put();
		}
	}
}

class Consumer extends Thread{
	Box box;
	volatile boolean running;
	Consumer(Box box) {
		this.box = box;
		this.running = false;
	}
	
	void startThread() {
		this.running = true;
		this.start();
	}
	
	void terminateThread() {
		this.running = false;
	}
	
	public void run() {
		while(this.running) {
			this.box.get();
			
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	
}


public class ThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box  = new Box();
		Producer producer = new Producer(box);
		Consumer consumer = new Consumer(box);
		
		producer.startThread();
		consumer.startThread();
		
		try {
		Thread.sleep(1000);
		}catch(InterruptedException ex) {
			
		}
		
		// terminate the threads
		producer.terminateThread();
		consumer.terminateThread();
		
		
	}

}
