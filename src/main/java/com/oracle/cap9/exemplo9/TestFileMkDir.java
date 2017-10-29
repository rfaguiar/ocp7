package com.oracle.cap9.exemplo9;

import java.io.File;
import java.io.IOException;

public class TestFileMkDir {
	public static void main(String[] args) {
		
		File mydir = new File("mydir2");
//		mydir.mkdir();
		File file = new File(mydir, "myfile.txt");//cria o objeto com o diretorio
		try {
			file.createNewFile();//vai lançar exceção pq o diretorio não existe
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
