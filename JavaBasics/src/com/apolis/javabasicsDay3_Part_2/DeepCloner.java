package com.apolis.javabasicsDay3_Part_2;

public class DeepCloner {

	public static void main(String[] args) {
		
		DeepFarmer farmer1 = new DeepFarmer("Fred", "Mosby", 41, new Farm(3, "rice"));
		DeepFarmer farmer2 = (DeepFarmer) farmer1.clone();
		
		System.out.println("Farmer 1 : " + farmer1);
		System.out.println("Farmer 2 : " + farmer1);
		
		System.out.println("\nBehold, one farmer cloned from another.\nAnd now we will assign Farmer 1 to a new chicken Farm.\n");
		farmer1.farm.cropGrown = "feed";
		farmer1.farm.numberOfAnimals = 800;
		
		System.out.println("Farmer 1 : " + farmer1);
		System.out.println("Farmer 2 : " + farmer2);
		System.out.println("Task completed successfully");
	}

}

class DeepFarmer implements Cloneable{
	String firstName, lastName;
	int age;
	Farm farm;
	
	public DeepFarmer(String firstName, String lastName, int age, Farm farm) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.farm = farm;
	}
	@Override
	public String toString() {
		return "Farmer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", farm=" + farm + "]";
	}
	
	//A deep implementation of the clone() method
	public Object clone() {
		return new DeepFarmer(this.firstName, this.lastName, this.age, new Farm(this.farm.numberOfAnimals, this.farm.cropGrown));  
	}  //Critical to deep cloning, the farm references a different Farm object
}
