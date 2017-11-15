package com.oracle.cap14.exemplo13;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class TestLinkedTransferQueue {
	public static void main(String[] args) {
		
		TransferQueue<Integer> tq = new LinkedTransferQueue<Integer>();
		
		System.out.println("add " + tq.add(1));
		try {
			tq.put(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("offer " + tq.offer(3));
		try {
			System.out.println("offer(arguments) " + tq.offer(4, 10, TimeUnit.MILLISECONDS));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tq.transfer(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("tryTransfer " + tq.tryTransfer(6));
		try {
			System.out.println("tryTransfer(arguments) " + tq.tryTransfer(7, 10, TimeUnit.MILLISECONDS));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("lendo");
		System.out.println("element " + tq.element());
		System.out.println("peek " + tq.peek());
		System.out.println("poll " + tq.poll());
		try {
			System.out.println("poll(arguments) " + tq.poll(10, TimeUnit.MILLISECONDS));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("remove " + tq.remove());
		try {
			System.out.println("take " + tq.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
