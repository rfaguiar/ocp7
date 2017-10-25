package com.oracle.cap1.exemplo1;

public enum CoffeSize {
	BIG(8), HUGE(10), OVERWHELMING(16);
	
	private int ounces;

	CoffeSize(int ounces) {
		this.ounces = ounces;		
	}

	public int getOunces() {
		return ounces;
	}
}
