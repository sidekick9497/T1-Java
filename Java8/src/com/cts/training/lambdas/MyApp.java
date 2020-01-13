package com.cts.training.lambdas;

class Sample{
	/*void sendMessage(String message) {
		System.out.println("Message sent :"  + message);
	}*/
	
	// injecting functionality
	void sendMessage(Greetings greetings, String message) {
		greetings.sendGreeting(message);
	}
}


public class MyApp {

	public static void test(String data) {
		System.out.println("This is a braodcast message : " + data);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		// obj.sendMessage("Hello All");
		Greetings email = new EmailGreetings();
		obj.sendMessage(email, "Hello All"); // passing functionality as object
		
		Greetings sms = new SmsGreetings();
		obj.sendMessage(sms, "Hello All"); // passing functionality as object
		
		obj.sendMessage(new Greetings() {

			@Override
			public void sendGreeting(String message) {
				// TODO Auto-generated method stub
				System.out.println("Greetings sent on TWITTER : " + message);
			}
			
		}, "Hello All");
		
		/*Greetings var = public void sendGreeting(String message) {
							// TODO Auto-generated method stub
							System.out.println("Greetings sent on TWITTER : " + message);
						};*/
		Greetings facebook = (message)->System.out.println("Greetings sent on FACEBOOK : " + message);
		// obj.sendMessage(facebook, "Hello All");
		
		// passing function as parameter
		obj.sendMessage(message->System.out.println("Greetings sent on FACEBOOK : " + message), "Hello All");
		
		// Method Reference
		// Greetings broadcast = <object  of class inherited from Greetings interface>		
		// Greetings broadcast = <lambda expression having signature same as abstract method of interface>
		// Greetings broadcast = <any function/method having signature same as abstract method of interface>
		Greetings broadcast = MyApp :: test;
		obj.sendMessage(broadcast, "Hello All");
	}

}

























