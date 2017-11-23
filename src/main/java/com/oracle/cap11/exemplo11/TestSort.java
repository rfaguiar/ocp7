package com.oracle.cap11.exemplo11;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		ArrayList<DVDInfo> dvdList = new ArrayList<>();
		dvdList = DVDInfo.populateList();
		Collections.sort(dvdList);
		System.out.println(dvdList);
		
		GenreSort gs = new GenreSort();
		Collections.sort(dvdList, gs);
		System.out.println(dvdList);
	}

	
}
