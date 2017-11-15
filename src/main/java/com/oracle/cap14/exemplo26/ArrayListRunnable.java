package com.oracle.cap14.exemplo26;

import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListRunnable implements Runnable {

	private CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
	
	public ArrayListRunnable() {
		for (int i = 0; i < 10_000; i++) {
			list.add(i);
		}
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		while (!list.isEmpty()) {
			System.out.println(tName + " removed " + list.remove(0));
		}
	}
	
	public static void main(String[] args) {
		ArrayListRunnable alr = new ArrayListRunnable();
		Thread t1 = new Thread(alr);
		Thread t2 = new Thread(alr);
		t1.start();
		t2.start();
	}

}
