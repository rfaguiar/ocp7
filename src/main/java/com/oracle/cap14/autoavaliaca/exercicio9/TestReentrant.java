package com.oracle.cap14.autoavaliaca.exercicio9;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReentrant {
	public static void main(String[] args) {
		ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		
		rwl.readLock().unlock();
		System.out.println("READ-UNLOCK-1");
		
		rwl.readLock().lock();
		System.out.println("READ-LOCK-1");
		
		rwl.readLock().lock();
		System.out.println("READ-LOCK-2");
		
		rwl.readLock().unlock();
		System.out.println("READ-UNLOCK-2");
		
		rwl.writeLock().lock();
		System.out.println("WRITE-LOCK-1");
		
		rwl.writeLock().unlock();
		System.out.println("WRITE-UNLOCK-2");
	}
}
