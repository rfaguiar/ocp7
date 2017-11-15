package com.oracle.cap13.exemplo9;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Name Runnable running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}

}
