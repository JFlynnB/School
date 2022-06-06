package com.apolis.javabasicsDay7_May26;

/* 4.Implement of default method in case of multiple inheritance */
public class FOUR_MultipleDefault {

	public static void main(String[] args) {
		
		BendingUnit bender = new BendingUnit();
		
		bender.bend();
		bender.calculate();
		bender.runFromCops();

	}

}

class BendingUnit implements Bending, Robot{

	@Override
	public void calculate() {
		System.out.println("What do I look like? I'm a bender, not some kind of math... calculating... thing!");
	}

	@Override
	public void bend() {
		System.out.println("Please insert girder...");
	}
	
	@Override
	public void runFromCops() {
		System.out.println("Cheese it!");
		Bending.super.runFromCops();
		Robot.super.runFromCops();
	}
	
}

interface Bending {
	public void bend();
	
	public default void runFromCops() {
		System.out.println("Running down an alley.");
	}
}

interface Robot {
	public void calculate();
	
	public default void runFromCops() {
		System.out.println("Hiding behind mailbox.");
	}
}