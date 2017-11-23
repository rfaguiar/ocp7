package com.oracle.cap11.exemplo23;

import java.util.List;

public class CarRental extends Rental {

	public CarRental(int maxNum, List<Car> rentalPoll) {
		super(maxNum, rentalPoll);
	}
	
	public Car getRental() {
		return (Car) super.getRental();
	}
	
	public void returnRental(Car c) {
		super.returnRental(c);
	}
	
	public void returnRental(Object o) {
		if (o instanceof Car) {
			super.returnRental(o);
		} else {
			System.out.println("Cannot add a non-Car");
		}
	}
}
