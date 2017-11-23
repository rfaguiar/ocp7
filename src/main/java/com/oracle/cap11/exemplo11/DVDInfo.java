package com.oracle.cap11.exemplo11;

import java.util.ArrayList;

public class DVDInfo implements Comparable<DVDInfo> {

	private String title;
	private String genre;
	private String leadActor;

	public DVDInfo(String title, String genre, String leadActor) {
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
	}	
	
	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
	}

	public static ArrayList<DVDInfo> populateList() {
		ArrayList<DVDInfo> dvdList = new ArrayList<>();
		dvdList.add(new DVDInfo("Donnie Darko", "sci-fi", "Gyllenhal, Jake"));
		dvdList.add(new DVDInfo("Raiders of the Lost Ark", "action", "Ford, Harrison"));
		dvdList.add(new DVDInfo("2001", "sci-fi", "??"));
		dvdList.add(new DVDInfo("Caddyshack", "comedy", "Murray, Bill"));
		dvdList.add(new DVDInfo("Star Wars", "sci-fi", "Ford, Harrison"));
		dvdList.add(new DVDInfo("Lost in Translation", "comedy", "Murray, Bill"));
		dvdList.add(new DVDInfo("Patriot Games", "action", "Ford, Harrison"));
		return dvdList;
	}
	
	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	
}
