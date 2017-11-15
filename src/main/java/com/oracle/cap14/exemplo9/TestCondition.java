package com.oracle.cap14.exemplo9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestCondition {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition blockingPoolA = lock.newCondition();
		
		lock.lock();
		try {
			blockingPoolA.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
