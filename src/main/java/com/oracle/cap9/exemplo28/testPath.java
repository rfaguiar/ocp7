package com.oracle.cap9.exemplo28;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testPath {
	public static void main(String[] args) {
		Path dir = Paths.get("/home/java");
		Path music = Paths.get("/home/java/country/Swift.mp3");
		Path mp3 = dir.relativize(music);
		System.out.println(mp3);
		
	}
}
