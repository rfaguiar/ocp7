package com.oracle.cap15.exemplo13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCResultType {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(), 
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
			
			String query = "SELECT * FROM CUSTOMER";
			ResultSet rs = stmt.executeQuery(query);
			for (int i = 1; ; i+=2) {
				if (rs.absolute(i)) {
					System.out.println(rs.getObject(1));
				} else {
					break;
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
