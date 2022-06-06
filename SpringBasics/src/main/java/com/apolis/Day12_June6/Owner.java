package com.apolis.Day12_June6;

public class Owner implements Adult{
	
	private String firstName;
	private String lastName;
	private Animal myPet;
	
	public Owner(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public Animal getMyPet() {
		return myPet;
	}

	public void setMyPet(Animal myPet) {
		this.myPet = myPet;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Owner [firstName=" + firstName + ", lastName=" + lastName + ", myPet=" + myPet + "]";
	}
	
	

}