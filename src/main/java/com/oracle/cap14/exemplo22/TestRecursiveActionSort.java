package com.oracle.cap14.exemplo22;

import java.util.concurrent.ForkJoinPool;

public class TestRecursiveActionSort {
	public static void main(String[] args) {
		
		int[] data = new int[200_000];
		ForkJoinPool fjPoll = new ForkJoinPool();
		RandomInitRecursiveaction action = new RandomInitRecursiveaction(data, 0, data.length);
		fjPoll.invoke(action);
		
		SortRecursiveAction task = new SortRecursiveAction(data, 0, data.length);
		fjPoll.invoke(task);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
