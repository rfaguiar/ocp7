package com.oracle.cap13.exemplo15;

public class Calculator implements Runnable{
	
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
		}
		System.out.println("Fim Calculator " + Thread.currentThread().getName());
	}

}
