package com.oracle.cap13.exemplo1;

public class FooRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Runnable is running");
		}
	}

}
