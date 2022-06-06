package com.apolis.javabasicsDay5_May24;

/* 8. Implements wait, notify and notifyAll */
public class MultiThreadEight {

	public static void main(String[] args) {
		Battery battery = new Battery(6);
		Car myCar = new Car(battery);
		SolarPanel myPanel = new SolarPanel(battery);
		
		Thread carThread = new Thread(myCar);
		Thread panelThread = new Thread(myPanel);
		
		carThread.start();
		panelThread.start();

	}

}

class Car implements Runnable{
	Battery battery;
	
	Car(Battery battery){
		this.battery = battery;
	}
	
	public void run(){
		while(true) {
			synchronized(battery) {
				while(battery.charge == 0) {
					System.out.println("Can't drive. Battery's empty. Got to charge");
					
					try {
						battery.wait();
					} catch (InterruptedException e) {e.printStackTrace();}	
				}
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("Driving...");
				battery.discharge();
				battery.notify();
			}
		}
	}
}

class SolarPanel implements Runnable{
	Battery battery;
	
	SolarPanel(Battery battery){
		this.battery = battery;
	}
	
	public void run(){
		while(true) {
			synchronized (battery) {
				while(battery.charge == battery.maxCapacity) {
					System.out.println("Battery full");
					
					try {
						battery.wait();
					} catch (InterruptedException e) {e.printStackTrace();}	
				}
				
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("Charging with the power of the sun!");
				battery.charge();
				battery.notifyAll();  //Hey, you don't know what this thing's powering
			}
		}
	}
}

class Battery{
	volatile int charge;
	int maxCapacity;
	int chargedOverLife;
	
	Battery(int maxCapacity){
		charge = 0;
		chargedOverLife = 0;
		this.maxCapacity = maxCapacity;
	}
	
	public void charge() {
		charge++;
		chargedOverLife++;
		System.out.println("Battery at " + charge + " level.  Been charged " + chargedOverLife + " times.");
	}
	
	public void discharge() {
		charge--;
		System.out.println("Battery at " + charge + " level.");
	}
}