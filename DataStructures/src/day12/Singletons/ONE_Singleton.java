package day12.Singletons;

public class ONE_Singleton extends Thread{

	public static void main(String[] args) {
		ONE_Singleton one = new ONE_Singleton();
		ONE_Singleton two = new ONE_Singleton();
		
		one.start();
		two.start();
		
		//break with threads
	}
	
	public void run() {
		FirstSingleton mySingle = FirstSingleton.getIt();
		mySingle.printMessage();
	}

}

 class FirstSingleton{
	private static FirstSingleton theObject;
	private String message;
	private int count = 0;
	private FirstSingleton() {
		this.message = "This Object has been intantiated " ;
		count++;
	}
	
	public static FirstSingleton getIt() {
		if(theObject == null) {
			theObject = new FirstSingleton();
		}
		return theObject;
	}
	
	public void printMessage() {
		System.out.println(message + count + " times");
	}
}
