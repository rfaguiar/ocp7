package com.oracle.cap11.exemplo23;

import java.util.List;

public class RentaLGeneric<T> {

	private List<T> rentalPoll;
	private int maxNum;
	
	public RentaLGeneric(int maxNum, List<T> rentalPoll) {
		this.maxNum = maxNum;
		this.rentalPoll = rentalPoll;		
	}
	
	public T getRantal() {
		return rentalPoll.get(0);
	}
	
	public void returnRental(T returnedThing) {
		rentalPoll.add(returnedThing);
	}
}
