package com.apolis.javabasicsDay4_May23;

// This example shows how an immutable class is implemented.
public class ImmutableExample {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Owner owner = new Owner("Steve", "Jobs", 55, new Pet("Fluffy", "Cat"));
		
	}

}

final class Owner{
	private String firstName;
	private String lastName;
	private int age;
	private Pet pet;
	
	Owner(String firstName, String lastName, int age, Pet pet){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.pet = new Pet(pet.name, pet.typeOfAnimal); //this would be returned by a deep-cloning method.
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Pet getPet() {
		return pet;
	}
	
	
}

class Pet{
	public String name, typeOfAnimal;
	
	Pet(String name, String typeOfAnimal){
		this.name = name;
		this.typeOfAnimal = typeOfAnimal;
	}
}