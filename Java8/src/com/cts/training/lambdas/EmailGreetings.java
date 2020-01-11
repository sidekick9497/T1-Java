package com.cts.training.lambdas;

public class EmailGreetings implements Greetings{

	@Override
	public void sendGreeting(String message) {
		// logic to send greetings over email
		System.out.println("Greeting sent on EMAIL : " + message);
	}

}
