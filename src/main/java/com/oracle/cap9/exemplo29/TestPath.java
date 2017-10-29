package com.oracle.cap9.exemplo29;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path absolute1 = Paths.get("/home/java");
		Path absolute2 = Paths.get("/usr/local");
		Path absolute3 = Paths.get("/home/java/temp/music.mp3");
		Path relative1 = Paths.get("temp");
		Path relative2 = Paths.get("temp/music.pdf");
		
		System.out.println("1: " + absolute1.relativize(absolute3));
		System.out.println("2: " + absolute3.relativize(absolute1));
		System.out.println("3: " + absolute1.relativize(absolute2));
		System.out.println("4: " + relative1.relativize(relative2));
		System.out.println("5: " + absolute1.relativize(relative1));
	}
}
