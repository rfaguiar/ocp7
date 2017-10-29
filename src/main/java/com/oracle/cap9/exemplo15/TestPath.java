package com.oracle.cap9.exemplo15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path path = Paths.get("fileWrite1.txt");
		System.out.println(Files.exists(path));
		try {
			Files.createFile(path);
			System.out.println(Files.exists(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
