package com.oracle.cap10.exemplo3;

import java.util.HashSet;
import java.util.Set;

public class Show {
	
	private Set<String> availableSeats;
	
	private Show () {
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookeSeats(String seat) {
		return availableSeats.remove(seat);
	}

	private static void ticketAgentBooks(String seat) {
		Show show = new Show();
		System.out.println(show.bookeSeats(seat));
	}
	
	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}	
	
}
