package com.apolis.javabasicsDay3_May20;

public class Talker implements Shoutable{

	String phrase;
	
	Talker(String whatToSay) {
		phrase = whatToSay;
	}
	
	void say() {
		System.out.println(phrase);
	}
	
	@Override
	public void shout() {
		System.out.println(phrase.toUpperCase() + "!");
		
	}
	
	public static void main(String[] args) {
		Shoutable myTalker = new Talker("How are you doing?");
		// myTalker.say();  //Not that Shoutable object doesn't necessarily have methods other than shout() so this doesn't work
							// since myTalker wasn't cast as a Talker object
		myTalker.shout();

	}
	

	

}


