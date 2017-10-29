package com.oracle.cap9.exemplo33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class TestBasicFileAttrbuteView {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/tmp/file");
		Files.createFile(path);
	
		BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
		
		FileTime lastUpdated = basic.lastModifiedTime();
		FileTime created = basic.creationTime();
		FileTime now = FileTime.fromMillis(System.currentTimeMillis());
		
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		basicView.setTimes(lastUpdated, now, created);
		
		Files.delete(path);
		
	}
}
