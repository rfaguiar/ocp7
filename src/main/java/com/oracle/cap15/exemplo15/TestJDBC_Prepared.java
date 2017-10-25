package com.oracle.cap15.exemplo15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.cap15.ConstantesBD;

public class TestJDBC_Prepared {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(),
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString())) {
			
			String query = "SELECT UNIT_PRICE FROM BOOK WHERE TITLE LIKE ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%Hero%");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getObject(1));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
