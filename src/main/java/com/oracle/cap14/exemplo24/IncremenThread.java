package com.oracle.cap14.exemplo24;

public class IncremenThread extends Thread {

	private Counter counter;

	public IncremenThread (Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			this.counter.increment();
		}
	}
	
}
