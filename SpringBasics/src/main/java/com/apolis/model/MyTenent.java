package com.apolis.model;

public class MyTenent implements Tenent{

	private String firstName;
	private String lastName;
	private int rent;
	private Unit unit;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "MyTenent [firstName=" + firstName + ", lastName=" + lastName + ", rent=" + rent + ", unit=" + unit
				+ "]";
	}
	
}