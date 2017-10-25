package com.oracle.cap15.exemplo9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCMetaData {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(), 
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement();) {
			
			String query = "SELECT AUTHOR.LAST_NAME, BOOK.TITLE FROM AUTHOR, BOOK, BOOKS_BY_AUTHOR"
					+ " WHERE AUTHOR.AUTHOR_ID=BOOKS_BY_AUTHOR.AUTHOR_ID"
					+ " AND BOOK.ISBN=BOOKS_BY_AUTHOR.ISBN";
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 1; i <= cols; i++) {
				System.out.print(rsmd.getTableName(i) + ":" + rsmd.getColumnName(i) + " ");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
