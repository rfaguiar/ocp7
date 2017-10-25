package com.oracle.cap13.exemplo9;

public class ThreadB extends Thread {
	int total;
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}	
	}
}
