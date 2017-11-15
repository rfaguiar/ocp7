package com.oracle.cap14.exemplo29;

import java.util.concurrent.ForkJoinPool;

public class TestRecursiveAction {
	public static void main(String[] args) {
		
		int data[] = new int[100_000_000];
		ForkJoinPool fjPoll = new ForkJoinPool();
		RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
		fjPoll.invoke(action);
		
		FindMaxPositionRecursiveTask task = new FindMaxPositionRecursiveTask(data, 0, data.length);
		Integer position = fjPoll.invoke(task);
		System.out.println("Position: " + position + ", value: " + data[position]);
		
	}
}
