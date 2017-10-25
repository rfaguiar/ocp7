package com.oracle.cap9.autoavaliaca.exercicio2;

import java.io.File;

public class Directories {
	static String [] dirs = {"dir1", "dir2"};
	public static void main(String[] args) {
		for (String d : dirs) {
			String path = d;
			File file = new File(path, "file2.txt");
			System.out.println(file.isFile() + " ");			
		}
	}
}
