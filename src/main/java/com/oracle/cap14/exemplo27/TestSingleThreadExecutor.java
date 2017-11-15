package com.oracle.cap14.exemplo27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThreadExecutor {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.execute(r);
	}
}
