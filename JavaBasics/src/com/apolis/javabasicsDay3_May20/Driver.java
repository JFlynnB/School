package com.apolis.javabasicsDay3_May20;

/*This demonstrates how multiple inheritance can be achieved by using interfaces. */
class BetterTalker implements Shoutable, Appendable {

	String phrase;
	
	BetterTalker(String whatToSay){
		phrase = whatToSay;
	}
	
	@Override
	public void append(String addendum) {
		phrase = phrase.concat(" ");
		phrase = phrase.concat(addendum);
	}

	@Override
	public void shout() {
		System.out.println(phrase.toUpperCase() + "!");
	}

	

}

public class Driver{
	public static void main(String[] args) {
		BetterTalker myTalker = new BetterTalker("Good morning");
		add(myTalker, ", the sun is shining");
		tellMe(myTalker);

	}
	
	public static void add(Appendable thing, String toAdd) {
		thing.append(toAdd);
	}
	public static void tellMe(Shoutable thing) {
		thing.shout();
	}
}
