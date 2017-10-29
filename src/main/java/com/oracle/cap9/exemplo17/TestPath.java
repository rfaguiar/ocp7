package com.oracle.cap9.exemplo17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path path2 = Paths.get("/tmp/source/directory");
		Path file = Paths.get("/tmp/source/directory/Program.java");
		
		try {
			Files.createDirectories(path2);
			Files.createFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
