package com.oracle.cap9.exemplo34;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class TestPosixAttbributes {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/tmp/file2");
		Files.createFile(path);
		
		PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
		Files.setPosixFilePermissions(path, perms);
		System.out.println(posix.permissions());
		System.out.println(posix.group());
		
		Files.delete(path);
		
	}
}
