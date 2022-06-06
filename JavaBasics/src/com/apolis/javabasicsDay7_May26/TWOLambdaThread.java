package com.apolis.javabasicsDay7_May26;

/* 2.create thread using lambda expression and then create thread using anonymous class. */
public class TWOLambdaThread {

	public static void main(String[] args) {
		
		Thread thread01 = new Thread(() -> {
			System.out.println("Thread 1 looks much cleaner.");
		});
		thread01.start();
		
		Thread thread02 = new Thread(new Runnable() {
			public void run() {
				System.out.println("This still isn't as bad as creating a whole new class that implements Runnable");
			}
		});
		thread02.start();
	}

}
