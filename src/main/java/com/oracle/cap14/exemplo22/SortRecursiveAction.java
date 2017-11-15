package com.oracle.cap14.exemplo22;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class SortRecursiveAction extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 10_000;
	private int[] data;
	private int start;
	private int end;
	
	public SortRecursiveAction(int[]data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected void compute() {
		
		if (end - start <= THRESHOLD) {
			Arrays.sort(data, start, end);
		} else {
			int halfWay = ((end - start) / 2) + start;
			SortRecursiveAction a1 = new SortRecursiveAction(data, start, halfWay);
			SortRecursiveAction a2 = new SortRecursiveAction(data, halfWay, end);
			invokeAll(a1, a2);
			
			if (data[halfWay -1] <= data[halfWay]) {
				return;
			}
			
			int[] temp = new int[end - start];
			int s1 = start;
			int s2 = halfWay;
			int d = 0;
			
			while (s1 < halfWay && s2 < end) {
				if (data[s1] < data[s2]) {
					temp[d++] = data[s1++];
				} else if (data[s1] > data[s2]) {
					temp[d++] = data[s2++];
				} else {
					temp[d++] = data[s1++];
					temp[d++] = data[s2++];
				}
			}
			
			if (s1 != halfWay) {
				System.arraycopy(data, s1, temp, d, temp.length - d);
			} else if (s2 != end) {
				System.arraycopy(data, s2, temp, d, temp.length - d);
			}
			System.arraycopy(temp, 0, data, start, temp.length);
		}
		
	}

}
