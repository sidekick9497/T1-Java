package com.cts.training.client;

import java.util.Scanner;

import com.cts.training.shapes.*;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter type of shape required :");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.print("Your choice : ");
		int choice = scanner.nextInt();
		Shape shape = null;
		
		if(choice == 1)
			shape = new Circle();
		else
			if(choice == 2)
				shape = new Rectangle();
			else {
				System.out.println("Bad Choice!!!");
				System.exit(1);
			}
		
		shape.draw();
	}

}
