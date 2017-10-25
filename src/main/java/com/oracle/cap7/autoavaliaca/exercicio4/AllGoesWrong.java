package com.oracle.cap7.autoavaliaca.exercicio4;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
	public static void main(String[] args) {
		AllGoesWrong a = new AllGoesWrong();
		try{
//			a.bloUp();
			System.out.println("a");
//		}catch (IOException e | SQLException e) {//não compila
//			System.out.println("c");
		}finally {
			System.out.println("d");
		}
	}

	void bloUp() throws IOException, SQLException {
		throw new SQLException();
		
	}
}
