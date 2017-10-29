package com.oracle.cap9.exemplo5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFile {
	public static void main(String[] args) {
		File file = new File("foo");//apenas criou o objeto File
		try {
			PrintWriter pw = new PrintWriter(file);//neste momento caso não exista o arquivo ele vai ser criado, este metodo lança FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
