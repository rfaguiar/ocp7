package com.oracle.cap11.exemplo40;

import java.util.List;

public class RentalGeneric<T> {

	private List<T> rentalPoll;
	
	private int maxNum;

	public RentalGeneric(List<T> rentalPoll, int maxNum) {
		this.rentalPoll = rentalPoll;
		this.maxNum = maxNum;
	}
	
	public T getRental() {
		return rentalPoll.get(0);
	}
	
	public void returnRental(T returnedThing) {
		rentalPoll.add(returnedThing);
	}
	
}
