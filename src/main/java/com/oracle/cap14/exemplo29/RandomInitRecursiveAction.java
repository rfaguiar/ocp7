package com.oracle.cap14.exemplo29;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInitRecursiveAction extends RecursiveAction {
	
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 10_000;
	private int [] data;
	private int start;
	private int end;
	
	public RandomInitRecursiveAction(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if (end -start <= THRESHOLD) {
			for (int i = start; i < end; i++) {
				data[i] = ThreadLocalRandom.current().nextInt(1, THRESHOLD);
			}
		} else {
			int halfWay = ((end - start) / 2) + start;
			RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, halfWay);
//			a1.fork();
			RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, halfWay, end);
//			a2.compute();
//			a1.join();
			invokeAll(a2, a1);
		}
	}

}
