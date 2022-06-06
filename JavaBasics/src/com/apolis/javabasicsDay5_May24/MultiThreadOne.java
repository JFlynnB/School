package com.apolis.javabasicsDay5_May24;

/* 1. Create thread using runnable interface. */
public class MultiThreadOne {

	public static void main(String[] args) {
		
		Thread thread01 = new Thread(new MyRunnable(), "01");
		
		thread01.start();
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int x = 1; x < 6; x++) {
			System.out.println(x + " seconds on Thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
