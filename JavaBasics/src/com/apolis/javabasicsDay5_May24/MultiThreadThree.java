package com.apolis.javabasicsDay5_May24;

/* 3. Create thread using anonymous class. */
public class MultiThreadThree {

	public static void main(String[] args) {
		Thread thread01 = new Thread(new Runnable() {
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
		});
		thread01.setName("01");
		thread01.start();
	}

}
