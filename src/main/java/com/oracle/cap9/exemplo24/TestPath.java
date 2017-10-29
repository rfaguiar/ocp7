package com.oracle.cap9.exemplo24;

import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		System.out.println(Paths.get("/a/./b/./c").normalize());
		System.out.println(Paths.get(".classpath").normalize());
		System.out.println(Paths.get("/a/b/c/..").normalize());
		System.out.println(Paths.get("../a/b/c").normalize());
	}
}
