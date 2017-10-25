package com.oracle.cap15.exemplo16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCPreparedInsert {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(), 
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());) {
			
			String query = "INSERT INTO BOOKS_BY_AUTHOR (AUTHOR_ID, ISBN) VALUES (?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query );
			pstmt.setInt(1, 1000);
			pstmt.setString(2, "0689852223");
			boolean execute = pstmt.execute();
			
			if (!execute) {
				System.out.println("INSERIDO COM SUCESSO");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
