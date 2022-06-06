package day12.Singletons;

//uses Double Checked Locking
public class BestSingle{
	private static volatile BestSingle theOne = null;
	private String message;
	private int count = 0;
	
	private BestSingle() {
		message = "The object has been instantiated ";
		count++;
	}
	
	public static BestSingle getThis() {
		if(theOne == null) {
			synchronized (BestSingle.class) { //have to use the class's monitor because
				if(theOne == null) {            //the object doesn't yet have a monitor
					theOne = new BestSingle(); //We check again inside the synchronize block
				}                             //so that we can be certain that it's still null
			}
		}
		return theOne;
	}
	public void printMessage() {
		System.out.println(message + count + " times.");
	}

	
}