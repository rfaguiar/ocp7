package com.oracle.cap13.exemplo13;

public class JoinTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}

}
