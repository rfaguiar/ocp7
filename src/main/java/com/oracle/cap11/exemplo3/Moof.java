package com.oracle.cap11.exemplo3;

public class Moof {
	
	private int moofValue;

	public Moof(int moofValue) {
		this.moofValue = moofValue;
	}
	
	public int getMoofValue() {
		return this.moofValue;
	}
	
	public boolean equals(Object o) {
		if ((o instanceof Moof) && ((Moof)o).getMoofValue() == this.moofValue) {
			return true;
		} else {
			return false;
		}
	}
}
