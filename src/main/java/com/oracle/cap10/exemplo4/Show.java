package com.oracle.cap10.exemplo4;

import java.util.HashSet;
import java.util.Set;

public class Show {

		private static final Show INSTANCE = new Show();
		private Set<String> availableSeats;
		
		private Show() {
			availableSeats = new HashSet<>();
			availableSeats.add("1A");
			availableSeats.add("1B");
		}
		
		public static Show getInstance() { return INSTANCE; }
		
		public boolean bookSeat(String seat) {
			return availableSeats.remove(seat);
		}
		
		private static void ticketAgentBooks(String seat) {
			Show show = Show.getInstance();
			System.out.println(show.bookSeat(seat));
		}
		
		public static void main(String[] args) {
			ticketAgentBooks("1A");
			ticketAgentBooks("1A");
		}
		
}
