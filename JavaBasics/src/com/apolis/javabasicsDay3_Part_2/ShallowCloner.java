package com.apolis.javabasicsDay3_Part_2;
/*This class is a demonstration of shallow cloning */
public class ShallowCloner {

	public static void main(String[] args) {
		
		ShallowFarmer farmer1 = new ShallowFarmer("John", "McDonald", 32, new Farm(3, "rice"));
		ShallowFarmer farmer2 = (ShallowFarmer) farmer1.clone();
		
		System.out.println("Farmer 1 : " + farmer1);
		System.out.println("Farmer 2 : " + farmer2);
		
		System.out.println("\nBehold, one farmer cloned from another.\nAnd now we will assign Farmer 1 to a new mango Farm.\n");
		farmer1.farm.cropGrown = "mango";
		farmer1.farm.numberOfAnimals = 12;
		
		System.out.println("Farmer 1 : " + farmer1);
		System.out.println("Farmer 2 : " + farmer2);
		System.out.println("Uh-oh! They were both re-assigned!");
	}

}

class ShallowFarmer implements Cloneable{
	String firstName, lastName;
	int age;
	Farm farm;
	
	public ShallowFarmer(String firstName, String lastName, int age, Farm farm) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.farm = farm;
	}
	@Override
	public String toString() {
		return "Farmer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", farm=" + farm + "]";
	}
	
	//A shallow implementation of the clone() method
	public Object clone() {
		return new ShallowFarmer(this.firstName, this.lastName, this.age, this.farm);  
	}  //Critical to shallow cloning, the farm references the same Farm object
}



