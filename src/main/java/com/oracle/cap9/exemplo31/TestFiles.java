package com.oracle.cap9.exemplo31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFiles {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/tmp/file");
		Files.createFile(path);
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		Files.delete(path);
		
	}
}
