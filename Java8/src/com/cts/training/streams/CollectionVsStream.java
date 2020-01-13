package com.cts.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionVsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		names.add("Fifth");
		
		// Consumer Implementation
		Consumer<String> nameConsumer = (name) -> System.out.println(name);
		
		// names.forEach(<asking for Consumer implementation>);
		// names.forEach(nameConsumer);
		// names.forEach((name) -> System.out.println(name));
		System.out.println("Traversing collection...");
		names.forEach(System.out :: println);
		System.out.println("Traversing collection...");
		names.forEach(System.out :: println);
		
		
		// put collection on stream (conveyer belt)
		Stream<String> namesStream =  names.stream();
		
		System.out.println("Stream output............");
		namesStream.forEach(nameConsumer);
		
		// cannot be reused..
		/*System.out.println("Stream output............");
		namesStream.forEach(nameConsumer);
		*/
	}

}
