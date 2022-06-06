package com.apolis.Day12_June6;

public class Pet implements Animal{
	private String name;
	private String animalType;
	private Adult myOwner;
	public Pet(String name, String animalType, Adult myOwner) {
		this.name = name;
		this.animalType = animalType;
		this.myOwner = myOwner;
	}
	public Pet() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adult getMyOwner() {
		return myOwner;
	}
	public void setMyOwner(Adult myOwner) {
		this.myOwner = myOwner;
	}
	public String getAnimalType() {
		return animalType;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", animalType=" + animalType + ", myOwner=" + myOwner.getFirstName() + "]";
	}
	
	

}
