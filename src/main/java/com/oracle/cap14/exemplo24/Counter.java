package com.oracle.cap14.exemplo24;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger count = new AtomicInteger();
	
	public void increment() {
		count.getAndIncrement();
	}
	
	public int getvalue() {
		return count.intValue();
	}
	
}
