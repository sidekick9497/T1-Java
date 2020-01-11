package com.cts.training.threads;


class AnonymousThread{
	Thread thread;
	AnonymousThread() {
		this.thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}

class MThreadPro{
	
	class ThreadSupport extends Thread{
		public void run() {
			
		}
	}
}


class MThread implements Runnable{

	Thread thread;
	MThread(){
		this.thread = new Thread(this);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThread T1 = new MThread();
		T1.thread.start();
		
		MThreadPro threadPro = new MThreadPro();
		MThreadPro.ThreadSupport threadSupport = threadPro.new ThreadSupport();
		threadSupport.start();
		
		AnonymousThread annThread = new AnonymousThread();
		annThread.thread.start();
		
	}

}
