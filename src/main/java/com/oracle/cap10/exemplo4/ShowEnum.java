package com.oracle.cap10.exemplo4;

import java.util.HashSet;
import java.util.Set;

public enum ShowEnum {
	
	INSTANCE;
	
	private Set<String> availableSeats;
	
	private ShowEnum() {
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
	
	private static void ticketAgentBooks(String seat) {
		ShowEnum show = ShowEnum.INSTANCE;
		System.out.println(show.bookSeat(seat));
	}
	
	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}
}
