package com.cts.training.threads;

class Resource{
	private int arr[];
	public void manageArray(String name, int size, int initValue) {
		// allot the memory
		this.arr = new int[size];
		
		// initialize array
		for(int i=0;i<size;i++)
			this.arr[i] = initValue + i;
		
		// using arrays
		for(int i=0;i<this.arr.length; i++) {
			System.out.println(name  + " : " + this.arr[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class UseArrayThread extends Thread{
	Resource resource;
	String name;
	int size;
	int initValue;
	
	UseArrayThread(Resource resource, String name, int size, int initValue) {
		this.resource = resource;
		this.name = name;
		this.size = size;
		this.initValue = initValue;
	}
	
	public void run() {
		this.resource.manageArray(this.name, this.size, this.initValue);
	}
}


public class CommonResourceEx {

	public static void main(String[] args) {
		Resource resource = new Resource();
		
		UseArrayThread thread1 = new UseArrayThread(resource, "Thread-1", 10, 100);
		UseArrayThread thread2 = new UseArrayThread(resource, "Thread-2", 15, 500);

		thread1.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
		}
		
		thread2.start();
	}

}
