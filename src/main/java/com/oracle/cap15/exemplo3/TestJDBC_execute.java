package com.oracle.cap15.exemplo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_execute {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString()
					, ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement();) {
			
			ResultSet rs;
			int numRows;
			String query = "UPDATE Book SET UNIT_PRICE=8.95 WHERE UNIT_PRICE < 8.95 AND BOOK_FORMAT='Hardcoder'";
			String query2 = "select * from AUTHOR";
			boolean status = stmt.execute(query2);
			
			if (status) {
				rs = stmt.getResultSet();				
				while (rs.next()) {
					System.out.println(rs.getObject(1));					
				}
			} else {
				numRows = stmt.getUpdateCount();
				if (numRows == -1) {
					System.out.println("No results");
				} else {
					System.out.println(numRows + " rows affected.");
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
