package com.oracle.cap9.exemplo36;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TestFileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		if (file.getFileName().endsWith(".class")) {
			Files.delete(file);
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws IOException {
		TestFileVisitor dirs = new TestFileVisitor();
		Files.walkFileTree(Paths.get("/home/rogerio/wildFly-swarm-examples/wildfly-swarm-examples"),
					dirs);
	}
}
