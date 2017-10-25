package com.oracle.cap13.exemplo2;

public class NameRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());		
	}

}
