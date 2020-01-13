package com.cts.training.streams;


import java.util.stream.IntStream;

public class ParallelCheck {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum1 = IntStream.rangeClosed(1, 1000000).sum();
		System.out.println("Sequential Sum : " + sum1);
		
		int sum2 = IntStream.rangeClosed(1, 1000000).parallel().sum();
		System.out.println("Parallel Sum : " + sum2);
		
		long start = System.currentTimeMillis();
		for(int i=0;i<2500; i++)
			IntStream.rangeClosed(1, 1000000).sum();
		long end = System.currentTimeMillis();
		long diff1 = end - start;
		
					
		start = System.currentTimeMillis();		
		for(int i=0;i<2500; i++)
			IntStream.rangeClosed(1, 1000000).parallel().sum();
		end = System.currentTimeMillis();
		long diff2 = end - start;
		
		System.out.println("Time taken in sequential : " + diff1);
		System.out.println("Time taken in parallel : " + diff2);
	}

}
