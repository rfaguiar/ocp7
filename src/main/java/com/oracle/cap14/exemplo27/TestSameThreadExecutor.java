package com.oracle.cap14.exemplo27;

import java.util.concurrent.Executor;

public class TestSameThreadExecutor {
	public static void main(String[] args) {
		Runnable r = new MyRunnableTask();
		Executor ex = new SameThreadExecutor();
		ex.execute(r);
	}
}
