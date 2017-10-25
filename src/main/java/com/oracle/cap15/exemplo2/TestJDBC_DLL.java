package com.oracle.cap15.exemplo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_DLL {

	public static void main(String[] args) {		
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(), 
					ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement();				
				) {
			
			String query = "UPDATE Book SET UNIT_PRICE=8.95 WHERE UNIT_PRICE < 8.95 AND BOOK_FORMAT='Hardcoder'";
			int numRows = stmt.executeUpdate(query);
			
			System.out.println("Num linhas afetadas: " + numRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
