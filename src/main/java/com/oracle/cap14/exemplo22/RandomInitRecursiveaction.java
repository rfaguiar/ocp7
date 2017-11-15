package com.oracle.cap14.exemplo22;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInitRecursiveaction extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 10_000;
	private int[] data;
	private int start;
	private int end;
	
	public RandomInitRecursiveaction(int[]data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected void compute() {
		if (end - start <= THRESHOLD) {
			for (int i = start; i < end; i++) {
				data[i] = ThreadLocalRandom.current().nextInt();
			}
		} else {
			int halfWay = ((end - start) / 2) + start;
			RandomInitRecursiveaction a1 = new RandomInitRecursiveaction(data, start, halfWay);
			a1.fork();
			RandomInitRecursiveaction a2 = new RandomInitRecursiveaction(data, halfWay, end);
			a2.compute();
			a1.join();
		}
	}

}
