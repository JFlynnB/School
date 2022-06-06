package day12.Singletons;

public class THREE_Eager extends Thread{

	public static void main(String[] args) {
		THREE_Eager one = new THREE_Eager();
		THREE_Eager two = new THREE_Eager();
		
		one.start();
		two.start();
	}
	
	public void run() {
		ThirdSingle mySingle = ThirdSingle.getThird();
		mySingle.printMessage();
	}

}

class ThirdSingle{
	
	private static ThirdSingle theOne = new ThirdSingle();
	private String message;
	private int count = 0;
	
	private ThirdSingle() {
		message = "This object exists";
		count++;
	}
	
	public static ThirdSingle getThird() {
		return theOne;
	}
	
	public void printMessage() {
		System.out.println(message + " " + count + " times.");
	}
}