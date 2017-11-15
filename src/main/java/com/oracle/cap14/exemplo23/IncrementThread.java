package com.oracle.cap14.exemplo23;

public class IncrementThread extends Thread {

	private Counter counter;
	
	public IncrementThread (Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			counter.increment();
		}
	}
}
