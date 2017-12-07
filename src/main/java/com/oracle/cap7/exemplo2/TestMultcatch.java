package com.oracle.cap7.exemplo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMultcatch {
	
	public void CouldThrowAnException() throws IOException, SQLException{}
	
	public void rethrow() throws SQLException, IOException {
		try {
			
			Connection coon = DriverManager.getConnection("");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
			
		}catch (SQLException | IOException e) {
			log(e);
			throw e;
		}
	}
	
	public void rethrow2() throws SQLException, IOException {
		try {
			
			Connection coon = DriverManager.getConnection("");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
			
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			log(e);
			throw e;
		}
	}

	private void log(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
