package com.oracle.cap11.exemplo29;

import java.util.ArrayList;
import java.util.Collections;

public class TestDVD {
	
	private ArrayList<DVDInfo> dvdList = new ArrayList<>();
	
	public static void main(String[] args) {
		new TestDVD().go();
	}

	private void go() {
		this.dvdList = (ArrayList<DVDInfo>) DVDInfo.populateList();
		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println(dvdList);
		
		GenreSort gs = new GenreSort();
		Collections.sort(dvdList, gs);
		System.out.println(dvdList);
	}
}
