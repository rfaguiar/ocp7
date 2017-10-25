package com.oracle.cap14.exemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MaxValueCollection {
	private List<Integer> integers = new ArrayList<Integer>();
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public void add(Integer i) {
		rwl.writeLock().lock();
		try{
			integers.add(i);
		} finally {
			rwl.writeLock().unlock();
		}
	}
	
	public int findMax() {
		rwl.readLock().lock();
		try {
			return Collections.max(integers);
		} finally {
			rwl.readLock().unlock();
		}
	}
	
}
