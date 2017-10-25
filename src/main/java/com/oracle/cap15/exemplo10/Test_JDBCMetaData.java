package com.oracle.cap15.exemplo10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class Test_JDBCMetaData {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(),
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement();) {
			
			String query = "SELECT * FROM AUTHOR";
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			String col, colData;
			for (int i = 1; i <= cols; i++) {
				System.out.print(leftJustify(rsmd.getColumnName(i), rsmd.getColumnDisplaySize(i)));
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					if (rs.getObject(i) != null) {
						colData = rs.getObject(i).toString();
					} else {
						colData = "NULL";
					}
					col = leftJustify(colData, rsmd.getColumnDisplaySize(i));
					System.out.print(col);
				}
				System.out.println();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String leftJustify(String s, int n) {
		if (s.length() <= n) {n++;}		
		return String.format("%1$-" + n + "s", s);
	}
}
