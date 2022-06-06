package com.apolis.javabasicsDay1_May18;

public class Lambdas {

	
	
	public static void main(String[] args) {
		
		Countable lambdaExample = (howManyGroups, groupedIn) -> {
			System.out.println(howManyGroups + " groups of " + groupedIn + " makes " + (howManyGroups * groupedIn) + " items.");
			return howManyGroups * groupedIn;
		};  //An example lambda expression
		
		int x = 6; //Example value: 6 cans of soft drink in a box.
		int y = 12; //Example value: 12 box of soft drink available.

		System.out.println("There are " + x + " cans of soft drink in a box.");
		System.out.println("There are " + y + " boxs of soft drink here.");
		countItems(lambdaExample, x, y);
		color(() -> System.out.println("The boxes are now blue!")); //Another example of a lambda expression. This one was not previously defined.
	}
	
	public static void countItems(Countable lambdaCountable, int howManyGroups, int groupedIn) {
		lambdaCountable.count(howManyGroups, groupedIn);
	}
	
	public static void color(Colorable item) {
		item.changeColor();
	}
	

}

/*

class Button()
{
	Clickable onClick;
	
	Button()
	{
		
	}
	
	public void setClick(Clickable click)
	{
		onClick = click;
	}
	
	public void DO_STUFF()
	{
		// detecting clicks
		onClick()
	}
}

class Page
{
	Button nextButton;
	Button previousButton;
	
	Page()
	{
		nextButton()
	}
	
	public void GoToNextPage()
	{
	}
	
	
}



List<Cats> cats;

var orangeCats = cats.Where(c => c.color == "orange");

*/