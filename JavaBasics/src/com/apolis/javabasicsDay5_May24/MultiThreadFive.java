package com.apolis.javabasicsDay5_May24;

import java.util.Arrays;

/* 5. Prepare 1 implementation of data inconsistency. */
public class MultiThreadFive {

	public static void main(String[] args) {
		
		Plane myTrain = new Plane();
		Thread thread01 = new Thread(new SeatSellerTwo("Joshua Billinghurst", myTrain, 3));
		Thread thread02 = new Thread(new SeatSellerTwo("Patrick Billinghurst", myTrain, 3));
		
		thread01.start();
		thread02.start();
		
		try {  //I do this so that we can see who is actually in the seat when both threads have died.
			thread01.join();
			thread02.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		
		
		myTrain.printSeats();
		
	}

}

class SeatSeller implements Runnable{
	
	String buyerName;
	Plane theTrain;
	int seatNumber;
	
	SeatSeller(String buyerName, Plane theTrain, int seatNumber){
		this.buyerName = buyerName;
		this.theTrain = theTrain;
		this.seatNumber = seatNumber;
	}

	@Override
	public void run() {
		
		theTrain.sellSeat(seatNumber, buyerName);
		
	}
}

class Train {
	
	String[] trainPassengers;
	
	Train(){
		trainPassengers = new String[5];
		Arrays.fill(trainPassengers, null);
		trainPassengers[0] = "The Driver";
	}
	/* Sells a given seat to a given person */
	public void sellSeat(int seatNumber, String passengerName) { //because this is not synchronized data inconsistency occurs
		if(trainPassengers[seatNumber] == null) {
			System.out.print("Seat number " + seatNumber + " is available for " + passengerName + "\n");
			trainPassengers[seatNumber] = passengerName;
			System.out.println(passengerName + " has booked the seat.");
		}else {
			System.out.println("That seat has been reserved by " + trainPassengers[seatNumber]);
		}
	}
	
	/* Prints out who is in each seat */
	public void printSeats() {
		System.out.println("The Passengers: " + Arrays.toString(trainPassengers));
	}
}