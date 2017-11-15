package com.oracle.cap14.exemplo7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		try {
			boolean locked = lock.tryLock(3, TimeUnit.SECONDS);
			if (locked) {
				try {
					
				}finally {
					lock.unlock();
				}
			}
		} catch (InterruptedException e) {
		}
	}
}
