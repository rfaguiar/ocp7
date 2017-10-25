package com.oracle.cap7.autoavaliaca.exercicio5;

import java.io.IOException;
import java.sql.SQLException;

public class BadIO {
	public static void main(String[] args) {
		BadIO a = new BadIO();
		try{
			a.fileBlowUp();
			a.databaseBlowUp();
			System.out.println("a");
		}catch (SQLException e) {
//		}catch (IOException | SQLException e) {
//		}catch (SQLException | IOException e) {
			System.out.println("b");
		}catch (Exception e) {
			System.out.println("c");
		}
	}

	void databaseBlowUp() throws IOException {
		throw new IOException();
	}

	void fileBlowUp() throws SQLException {
		throw new SQLException();
	}
}
