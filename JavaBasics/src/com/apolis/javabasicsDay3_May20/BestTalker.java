package com.apolis.javabasicsDay3_May20;

/*This example demonstrates how one can provide multiple inheritance
 * by extending a class and implementing an interface. It builds off of a previous example.
 */

public class BestTalker extends Talker implements Appendable{

	BestTalker(String whatToSay) {
		super(whatToSay);
	}

	@Override
	public void append(String addendum) {
		phrase = phrase.concat(" ");
		phrase = phrase.concat(addendum);
		
	}

	public static void main(String[] args) {
		BestTalker myTalker = new BestTalker("Good Morning.");
		add(myTalker, "How are you doing?");
		talk(myTalker);

	}

	public static void add(Appendable thing, String toAdd) {
		thing.append(toAdd);
	}
	public static void talk(Shoutable thing) {
		thing.shout();
	}

	

}
