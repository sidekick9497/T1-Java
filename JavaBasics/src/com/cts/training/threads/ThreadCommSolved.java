package com.cts.training.threads;

class BoxPro{
	private int count;
	boolean produced;
	BoxPro(){
		this.count = 0;
		this.produced = false;
	}
	
	synchronized void put() {
		if(this.produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		this.count++;
		System.out.println("Produced : " + this.count);
		this.produced = true;
		notify();
	}
	synchronized void get() {
		if(!this.produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		this.count--;
		System.out.println("Consumed : " + this.count);
		this.produced = false;
		notify();
	}
}

class ProducerPro extends Thread{
	BoxPro box;
	volatile boolean running;
	ProducerPro(BoxPro box) {
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

class ConsumerPro extends Thread{
	BoxPro box;
	volatile boolean running;
	ConsumerPro(BoxPro box) {
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


public class ThreadCommSolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxPro box  = new BoxPro();
		ProducerPro producer = new ProducerPro(box);
		ConsumerPro consumer = new ConsumerPro(box);
		
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
