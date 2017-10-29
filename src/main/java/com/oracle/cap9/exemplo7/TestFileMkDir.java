package com.oracle.cap9.exemplo7;

import java.io.File;
import java.io.IOException;

public class TestFileMkDir {
	public static void main(String[] args) {
		
		File myDir = new File("mydir");
		File myfile = new File(myDir, "myFile.txt");//cri um objeto File
		
		try {
			System.out.println(myfile.createNewFile());//cria o arquivo dentro do direto myDir
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
