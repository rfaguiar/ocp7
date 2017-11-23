package com.oracle.cap11.exemplo29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DVDInfo implements Comparable<DVDInfo> {
	private String title;
	private String genre;
	private String leadActor;
	
	public static void main(String[] args) {
		ArrayList<DVDInfo> dvdList = (ArrayList<DVDInfo>) populateList();
		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println(dvdList);
	}
	
	public static List<DVDInfo> populateList() {
		List<DVDInfo> retorno = new ArrayList<>();
		retorno.add(new DVDInfo("Donnie Darko", "sci-fi", "Gyllenhall, Jake"));
		retorno.add(new DVDInfo("Raiders of the Lost Ark", "action", "Ford, Harrison"));
		retorno.add(new DVDInfo("2001", "sci-fi", "??"));
		retorno.add(new DVDInfo("Caddyshack", "comedy", "Murray, Bill"));
		retorno.add(new DVDInfo("Star Wars", "sci-fi", "Ford, Harrison"));
		retorno.add(new DVDInfo("Lost in Translation", "comedy", "Murray, Bill"));
		retorno.add(new DVDInfo("Patriot Games", "action", "Ford, Harrison"));
		return retorno;
	}
	
	public int compareTo(DVDInfo d) {
		return this.title.compareTo(d.getTitle());
//		return d.getTitle().compareTo(this.title);
	}
	
	public DVDInfo(String title, String genre, String leadActor) {
		super();
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DVDInfo other = (DVDInfo) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return title + " " + genre + " " + leadActor + "\n" ;
	}
	
	
}
