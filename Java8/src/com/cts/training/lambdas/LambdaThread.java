package com.cts.training.lambdas;

class AnonymousThread{
	Thread thread;
	AnonymousThread() {
		//  ask for object inherited/of type Runnable
		
		// Lambda implementation
		Runnable runnable = () -> {
			for(int i =0 ;i<100;i++)
				System.out.println("Thread : " + i);
		};
		// this.thread = new Thread(runnable);
		this.thread = new Thread(() -> {
			for(int i =0 ;i<100;i++)
				System.out.println("Thread : " + i);
		});
	}
}

public class LambdaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousThread T = new AnonymousThread();
		T.thread.start();
	}

}
