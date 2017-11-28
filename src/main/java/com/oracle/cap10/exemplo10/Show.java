package com.oracle.cap10.exemplo10;

import java.util.HashSet;
import java.util.Set;

public class Show {
	
	private Set<String> availableSeats;
	
	public Show() {
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");	
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
	
	private static void ticketAgentBooks(String seats) {
		Show show = new Show();
		System.out.println(show.bookSeat(seats));
	}
	
	public static void main(String[] args) {
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");
	}
	
}
