package com.oracle.cap14.exemplo5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			
		}finally {
			lock.unlock();
		}
	}
}
