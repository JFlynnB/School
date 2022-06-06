package com.apolis.javabasicsDay5_May24;

import java.util.Arrays;
/* 6. Implement synchronization method */
public class SIX {

	public static void main(String[] args) {
		Plane myPlane = new Plane();
		Thread thread01 = new Thread(new SeatSellerTwo("Joshua Billinghurst", myPlane, 3));
		Thread thread02 = new Thread(new SeatSellerTwo("Patrick Billinghurst", myPlane, 3));
		
		thread01.start();
		thread02.start();
		
		try {  //I do this so that we can see who is actually in the seat when both threads have died.
			thread01.join();
			thread02.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		
		
		myPlane.printSeats();
		
	}

}

class SeatSellerTwo implements Runnable{
	
	String buyerName;
	Plane thePlane;
	int seatNumber;
	
	SeatSellerTwo(String buyerName, Plane thePlane, int seatNumber){
		this.buyerName = buyerName;
		this.thePlane = thePlane;
		this.seatNumber = seatNumber;
	}

	@Override
	public void run() {
		
		thePlane.sellSeat(seatNumber, buyerName);
		
	}
}

class Plane {
	
	String[] planePassengers;
	
	Plane(){
		planePassengers = new String[5];
		Arrays.fill(planePassengers, null);
		planePassengers[0] = "The Pilot";
	}
	/* Sells a given seat to a given person */
	public synchronized void sellSeat(int seatNumber, String passengerName) { //because this is synchronized, no data inconsistency occurs
		if(planePassengers[seatNumber] == null) {
			System.out.print("Seat number " + seatNumber + " is available for " + passengerName + "\n");
			planePassengers[seatNumber] = passengerName;
			System.out.println(passengerName + " has booked the seat.");
		}else {
			System.out.println("That seat has been reserved by " + planePassengers[seatNumber]);
			System.out.println("Apologies to " + passengerName);
		}
	}
	
	/* Prints out who is in each seat */
	public void printSeats() {
		System.out.println("The Passengers: " + Arrays.toString(planePassengers));
	}


}


