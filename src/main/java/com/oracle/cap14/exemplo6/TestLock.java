package com.oracle.cap14.exemplo6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		boolean locked = lock.tryLock();
		if (locked) {
			try {
				
			}finally {
				lock.unlock();
			}
		}
	}
}
