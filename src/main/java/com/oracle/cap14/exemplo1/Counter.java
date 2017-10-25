package com.oracle.cap14.exemplo1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger count = new AtomicInteger();
	public void incrmeent() {
		count.getAndIncrement();
	}
	public int getValue() {
		return count.intValue();
	}
}
