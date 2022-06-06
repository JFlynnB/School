package day12.Singletons;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Four_Best extends Thread{

	public static void main(String[] args) {
		
		BestSingle mySingle = BestSingle.getThis();
		mySingle.printMessage();
		try {
			breakByReflection(mySingle);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(mySingle.hashCode());
	}
	
	public void run() {
		BestSingle mySingle = BestSingle.getThis();
		mySingle.printMessage();
	}
	@SuppressWarnings("unchecked")
	private static void breakByReflection(BestSingle orginalsingleton)
	        throws ClassNotFoundException, NoSuchMethodException,
	        InstantiationException, IllegalAccessException,
	        InvocationTargetException {

	    Class<?> singletonClass = Class.forName("day12.Singletons.BestSingle");
	    
	    Constructor<BestSingle> constructor = (Constructor<BestSingle>) singletonClass
	            .getDeclaredConstructor();
	    constructor.setAccessible(true);
	    BestSingle s = constructor.newInstance();
	    System.out.println(orginalsingleton.equals(s));
	    s.printMessage();
	    System.out.println(s.hashCode());
	}

}
