package com.oracle.cap9.exemplo38;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class TestPathMatcher {

		public static void main(String[] args) {
			Path path1 = Paths.get("/home/One.txt");
			Path path2 = Paths.get("One.txt");
			
			PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");
			System.out.println(matcher.matches(path1));
			System.out.println(matcher.matches(path2));
		}
}
