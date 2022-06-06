package com.apolis.javabasicsDay6_May25;

/* 1.implements volatile keyword example.  */
public class OneVolatile {

	
	
	public static void main(String[] args) {
		
		//boolean stillAlive = true;
		//Lungs lungs = new Lungs();
		Thread brainStem = new Thread(new Runnable(){
			public void run() {
				while(true) 
				{

						
						if(Lungs.lungsFull) {
							System.out.println("Breath in!");
						}
						else {
							System.out.println("Breath out!");
						}
						try {
							Thread.sleep(1200);
						}catch(InterruptedException ie) {
							System.out.println("You died unexpectedly. :'(");
						}
						
				}
			}
		});
		
		Thread breathing = new Thread(new Runnable() {
			public void run() {
				while(true) 
				{
					
						
						if(Lungs.lungsFull) {
							System.out.println("Breathing out.");
							Lungs.lungsFull = false;
						}else {
							System.out.println("Breathing in.");
							Lungs.lungsFull = true;
						}
						try {
							Thread.sleep(1199);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
			}
		});
		breathing.start();
		brainStem.start();
		
		
	}
}

class Lungs {
	public volatile static boolean lungsFull = false;
	
}

