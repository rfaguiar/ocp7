package com.oracle.cap9.exemplo19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path one = Paths.get("/tmp/test1");
		Path two = Paths.get("/tmp/test2.txt");
		Path targ = Paths.get("/tmp/test23.txt");
		
		try {
			Files.copy(one, targ);
			Files.copy(two, targ);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
