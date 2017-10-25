package com.oracle.cap13.exemplo10;

public class Calculator implements Runnable{
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
//			notify();
		}
	}

}
