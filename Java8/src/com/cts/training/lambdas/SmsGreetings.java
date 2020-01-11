package com.cts.training.lambdas;

public class SmsGreetings implements Greetings{

	@Override
	public void sendGreeting(String message) {
		// logic to send greeting over SMS
		System.out.println("Greetings sent on SMS : " + message);
		
	}

}
