package com.oracle.cap14.exemplo23;

public class TestIncrementThread {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		IncrementThread it1 = new IncrementThread(counter);
		IncrementThread it2 = new IncrementThread(counter);
		it1.start();
		it2.start();
		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {}
		System.out.println(counter.getValue());
		
	}
}
