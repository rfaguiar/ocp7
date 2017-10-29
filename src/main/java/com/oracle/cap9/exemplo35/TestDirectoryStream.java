package com.oracle.cap9.exemplo35;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDirectoryStream {
	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get("/home/rogerio");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "[vw]*")) {
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		}
		
	}
}
