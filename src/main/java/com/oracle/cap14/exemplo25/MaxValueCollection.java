package com.oracle.cap14.exemplo25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MaxValueCollection {
	
	private List<Integer> integers = new ArrayList<>();
	
	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public void add (Integer i) {
		Lock lock = rwl.writeLock();
		lock.lock();
		try {
			integers.add(i);
		} finally {
			lock.unlock();
		}
	}
	
	public int findMax() {
		Lock lock = rwl.readLock();
		lock.lock();
		try {
			return Collections.max(integers);
		} finally {
			lock.unlock(); 
		}
	}

}
