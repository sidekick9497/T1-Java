package com.cts.training.streams;

import java.util.stream.IntStream;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc1 = new Calculator();
		
		IntStream.rangeClosed(1, 1000).forEach(calc1 :: sum);
		System.out.println("Total Sum (Seq): " + calc1.getResult());
		
		Calculator calc2 = new Calculator();
		
		IntStream.rangeClosed(1, 1000).parallel().forEach(calc2 :: sum);
		System.out.println("Total Sum (Parallel): " + calc2.getResult());
	}

}
