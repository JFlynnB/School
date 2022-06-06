package day12.Singletons;

public class TWO_Single extends Thread{

	public static void main(String[] args) {
		
		TWO_Single one = new TWO_Single();
		TWO_Single two = new TWO_Single();
		
		one.start();
		two.start();

	}
	
	public void run() {
		SecondSingle mySingle = SecondSingle.getIt();
		mySingle.printMessage();
	}

}

//This cannot be broken by multiple threads because the instantiating code is synchronized 
class SecondSingle{
	private static SecondSingle theObject;
	private String message;
	private int count = 0;
	
	private SecondSingle() {
		this.message = "This Object has been instantiated" ;
		count++;
	}
	
	public static synchronized SecondSingle getIt() {
		if(theObject == null) {
			theObject = new SecondSingle();
		}
		return theObject;
	}
	
	public void printMessage() {
		System.out.println(message + " " + count + " times.");
	}
}