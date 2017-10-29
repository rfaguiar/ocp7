package com.oracle.cap9.exemplo23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		String buildProject = "/tmp/BuildProject/scripts";
		String upTwoDirectories = "../..";
		String myProject = "/My_Project/source";
		
		Path path = Paths.get(buildProject, upTwoDirectories, myProject);
		
		System.out.println("Original: " + path);
		System.out.println("Normalized: " + path.normalize());
	}
}
