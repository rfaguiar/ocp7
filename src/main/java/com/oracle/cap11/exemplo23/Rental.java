package com.oracle.cap11.exemplo23;

import java.util.List;

public class Rental {
	private List rentalPoll;
	private int maxNum;
	
	public Rental (int maxNum, List rentalPoll) {
		this.rentalPoll = rentalPoll;
		this.maxNum = maxNum;
	}
	
	public Object getRental() {
		return rentalPoll.get(0);
	}
	
	public void returnRental (Object o) {
		rentalPoll.add(o);
	}
}
