package com.oracle.cap9.exemplo11;

import java.io.File;
import java.io.IOException;

public class TestFileDeleteRenameTo {
	public static void main(String[] args) {
		
		File delDir = new File("deldir");
		delDir.mkdir();//cria o diretorio
		
		File delFile1 = new File(delDir, "delFile1.txt");
		try {
			delFile1.createNewFile();//adiciona o arquivo ao diretorio pode lançar IOException
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File delFile2 = new File(delDir, "delFile2.txt");
		try {
			delFile2.createNewFile();//cria o segundo arquivo no diretorio
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		delFile1.delete();// Exclui o primeiro arquivo
		System.out.println("delDir is " + delDir.delete());//tenta deleta o diretorio que contem o arquivo 2
		
		File newName = new File(delDir, "newName.txt");
		delFile2.renameTo(newName);//Renomei o arquivo 2 para newName
		
		File newDir = new File("newDir");
		delDir.renameTo(newDir);//renomeia o diretorio
		
	}
}
