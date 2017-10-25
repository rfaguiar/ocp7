package com.oracle.cap15.exemplo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_execResultSet {

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString()
					, ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
				Statement stmt = conn.createStatement();) {
			
			String query = "SELECT FIRST_NAME, LAST_NAME, EMAIL FROM CUSTOMER WHERE LAST_NAME LIKE 'C%' ";
			ResultSet rs = stmt.executeQuery(query);
//			System.out.print(rs.getObject(1) + " ");// SQLException ao tenta acessar sem mover o cursor
			while (rs.next()) {
				System.out.print(rs.getObject(1) + " ");
				System.out.print(rs.getObject(2) + " ");
				System.out.println(rs.getObject(3));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
