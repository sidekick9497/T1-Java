package com.cts.training.threads;

public class MThread extends Thread{

	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			System.out.println("Thread :" + i);
		}
	}
}
