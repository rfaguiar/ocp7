package com.oracle.cap9.exemplo27;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
	public static void main(String[] args) {
		Path path = Paths.get("/usr/bin/zip");
//		path.resolve(null);//não compila
		
		Path path2 = Paths.get("/home/java");
		Path other = null;
		path2.resolve(other);//erro ao executar
		path.resolve((String) null);//erro ao executar
	}
}
