package com.oracle.cap9.exemplo10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args) {
		
		File existingDir = new File("existingDir");
		System.out.println(existingDir.isDirectory());
		
		File existingFile = new File(existingDir, "existingFile.txt");
		System.out.println(existingFile.isFile());
		
		
		try  {
			FileReader fr = new FileReader(existingFile);//pode lançar FileNotFoundException ao criar/abrir o arquivo
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			while ((s = br.readLine()) != null) { //lançar IOException ao ler os dados
				System.out.println(s);
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
