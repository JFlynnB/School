package com.apolis.Day12_June6;

public interface Adult {

	public Animal getMyPet();

	public void setMyPet(Animal myPet);

	public String getLastName();

	public void setLastName(String lastName);

	public String getFirstName();

	public void setFirstName(String firstName);

	@Override
	public String toString();
}
