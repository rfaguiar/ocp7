package com.oracle.cap13.exemplo10;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 3 ; i++) {
			System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + i);
		}
	}

}
