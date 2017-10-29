package com.oracle.cap9.exemplo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWriter {
	public static void main(String[] args) {
		try {
			File file = new File("fileWriter2.txt");
			FileWriter fw = new FileWriter(file);
			
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("howdy");
			pw.println("folks");
			
			pw.flush();
			pw.close();
			
			//le os dados
			File file2 = new File("fileWriter2.txt");
			FileReader fr = new FileReader(file2);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			br.close();
			System.out.println(data);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
