package com.oracle.cap10.exemplo9;

public class GiftBox implements Box {

	@Override
	public void pack() {
		System.out.println("pack box");
	}

	@Override
	public void seal() {
		System.out.println("seal box");
	}

}
