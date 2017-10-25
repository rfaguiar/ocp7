package com.oracle.cap14.exemplo1;

public class IncrementThread extends Thread{
	private Counter counter;
	
	public IncrementThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			counter.incrmeent();
		}
	}
}
