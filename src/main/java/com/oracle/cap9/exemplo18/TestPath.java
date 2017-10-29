package com.oracle.cap9.exemplo18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path source = Paths.get("/tmp/test1");
		Path target = Paths.get("/tmp/test2.txt");
		
		try {
			Files.copy(source, target);
			Files.delete(target);
			Files.move(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
