package com.oracle.cap14.exemplo18;

public class MyRunnableTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
		}
	}
	
}
