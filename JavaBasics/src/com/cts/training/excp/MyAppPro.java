package com.cts.training.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyAppPro {

	public static void ageInput() throws InvalidAgeException{
		int age;
		Scanner scanner  = new Scanner(System.in);
		try {
			System.out.print("Enter age of employee : ");
			age = scanner.nextInt();
			if(age < 20 || age > 60)
				throw new InvalidAgeException("Valid Age range is 20-60 : provided (" + age + ")"); // raise an exception
				//System.out.println("Invalid age!!!");
			System.out.println("Age Entered Successfully");
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid data format!!!");
		}
		/*catch(InvalidAgeException ae) {
			System.out.println("Invalid age!!!");
		}*/
	}
	
	public static void main(String[] args) throws InvalidAgeException{
		// TODO Auto-generated method stub
		ageInput();
	}

}
