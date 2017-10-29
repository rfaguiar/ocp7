package com.oracle.cap9.exemplo32;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class TestBasicFilesAttributes {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/tmp/file");
		Files.createFile(path);
		
		BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("create: " + basic.creationTime());
		System.out.println("access: " + basic.lastAccessTime());
		System.out.println("modify: " + basic.lastModifiedTime());
		System.out.println("directory: " + basic.isDirectory());
		
		Files.delete(path);
		
	}
}
