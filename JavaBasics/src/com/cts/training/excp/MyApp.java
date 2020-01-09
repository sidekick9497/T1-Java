package com.cts.training.excp;




public class MyApp {

	public static void fun() {
		System.out.println("Before Evaluation");
		int a, b, c;
		int arr[] = new int[5];
		try {
			a = 10;
			b = 2;
			if(b==2)
				return;
			c = a/b;
			arr[8] = 20;
			System.out.println("After Evaluation");
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic problem handled!!!");
		}
		/*catch(ArrayIndexOutOfBoundsException aob) {
			System.out.println("Array problem handled!!!");
		}
		catch(Exception ex) {
			System.out.println("General handler!!!");
		}*/
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("After everything...");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try {
			fun();
		/*}
		catch(ArrayIndexOutOfBoundsException aob) {
			System.out.println("Array problem handled in main!!!");
		}*/
		System.out.println("Back to main");
	}

}
