package com.cts.training.client;

import java.util.Scanner;

import com.cts.training.shapes.*;

public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of shaped to draw : ");
		byte n = scanner.nextByte();
		
		Shape sarr[] = new Shape[n]; // array of ref of Shape class
		
		for(int i = 0 ;i<n ;i++) {
			System.out.println("Enter type of shape required (" + (i+1) + ") :");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Polygon");
			System.out.print("Your choice : ");
			byte choice = scanner.nextByte();
			
			switch(choice) {
			case 1: sarr[i] = new Circle(); break;
			case 2: sarr[i] = new Rectangle(); break;
			case 3: sarr[i] = new Square(); break;
			case 4: sarr[i] = new Polygon(); break;
			default : sarr[i] = null;
			}
		}
		
		for(int i = 0;i<n;i++)
			sarr[i].draw();
		
	}

}



























