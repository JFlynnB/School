package com.apolis.javabasicsDay6_May25;

import java.util.ArrayList;
import java.util.Iterator;

/* 2.How to break immutable class and how to fix that. */
public class TwoImmutableBreak {

	public static void main(String[] args) {
		
		ArrayList<String> thingsBought = new ArrayList<String>();
		thingsBought.add("Apple");
		thingsBought.add("Apple");
		thingsBought.add("Rice");
		thingsBought.add("Flour");
		thingsBought.add("Garlic");
		TransactionRecord tr = new TransactionRecord("Joshua", "Walmart", thingsBought, 23.00);
		
		System.out.println("\nBefore breaking: \n");
		tr.printTransaction();
		
		System.out.println("\nAfter breaking: \n");
		thingsBought.remove(1);
		thingsBought.add(1, "Banana");
		tr.printTransaction();
		
	}

}

final class TransactionRecord {
	
	private final String customer, seller;
	private final ArrayList<String> products;
	private final double amountPaid;
	
	TransactionRecord(String customer, String seller, ArrayList<String> products, double amountPaid){
		this.customer = customer;
		this.seller = seller;
		this.amountPaid = amountPaid;
		
		//this.products = products;     //If you want the TransactionRecord to be breakable, uncomment this line

		ArrayList<String> temp = new ArrayList<>();
		Iterator<String> itr = products.iterator();
		while(itr.hasNext()) {
			temp.add(itr.next());
		}
		this.products = temp;       // If you want the TransactionRecord to be breakable, comment this line
	}
	
	public String getCustomer() {
		return customer;
	}
	public String getSeller() {
		return seller;
	}

	public ArrayList<String> getProducts() {
		ArrayList<String> temp = new ArrayList<>();
		Iterator<String> itr = products.iterator();
		while(itr.hasNext()) {
			temp.add(itr.next());
		}
		return temp;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	
	public void printTransaction() {
		System.out.println("Customer : " + customer);
		System.out.println("Seller : " + seller);
		System.out.println("Items bought :");
		for(String item : products) {
			System.out.println("   " + item);
		}
		System.out.println("Amount Paid : $" + amountPaid);
	}
	
}


