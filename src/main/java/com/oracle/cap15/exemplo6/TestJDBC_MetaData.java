package com.oracle.cap15.exemplo6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_MetaData {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(ConstantesBD.URL.toString(),
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = con.createStatement();) {
			
			String query = "SELECT AUTHOR_ID FROM AUTHOR";
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			rs.next();
			int colCount = rsmd.getColumnCount();
			
			System.out.println("Collumn Count: " + colCount);
			for (int i = 1; i <= colCount; i++) {
				System.out.println("Table Name: " + rsmd.getTableName(i));
				System.out.println("Column Name: " + rsmd.getColumnName(i));
				System.out.println("Column Size: " + rsmd.getColumnDisplaySize(i));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
