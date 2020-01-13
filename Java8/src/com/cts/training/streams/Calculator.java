package com.cts.training.streams;

public class Calculator {
	private int result;
	
	
	public Calculator() {
		this.result = 0;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void sum(int value) {
		this.result += value;
	}
}
