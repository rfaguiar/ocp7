package com.oracle.cap15.exemplo8;

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
			
			String query = "SELECT * FROM AUTHOR";
			String colData;
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 1; i <= cols; i++) {
				System.out.print(rsmd.getColumnName(i) + " ");
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					if (rs.getObject(i) != null) {
						colData = rs.getObject(i).toString();
					} else {
						colData = "NULL";
					}
					System.out.print(colData + " ");
				}
				System.out.println();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
