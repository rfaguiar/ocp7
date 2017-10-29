package com.oracle.cap9.exemplo20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/tmp/out.txt");
		try {
			Files.createFile(path);
		}finally {
			Files.delete(path);
		}
	}
}
