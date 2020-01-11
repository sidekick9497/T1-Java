package com.cts.training.interfaceex;

public interface IMethodCheck {
	default public void fun() {
		System.out.println("Fun of interface");
	}
	
	
	public static void sfun() {
		System.out.println("SFun of interface");
	}
}
