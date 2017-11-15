package com.oracle.cap14.exemplo27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestnewCachedThreadPool {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(r);
	}
}
