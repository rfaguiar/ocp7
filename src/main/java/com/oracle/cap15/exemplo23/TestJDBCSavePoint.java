package com.oracle.cap15.exemplo23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCSavePoint {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(), 
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString())) {
			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			int result1, result2, result3;
			Savepoint sp1 = null;
			try {
				result1 = stmt.executeUpdate("INSERT INTO AUTHOR VALUES (1031, 'Rachel', 'McGinn')");
				result2 = stmt.executeUpdate("INSERT INTO BOOK VALUES ('0554466789', 'My American Dolls', '2012-08-31', 'Paperback', 7.95)");
				
				sp1 = conn.setSavepoint();
			}catch (SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
			
			try {
				result3 = stmt.executeUpdate("INSERT INTO BOOKS_BY_AUTHOR VALUES (1031, '0554466789')");
				conn.commit();
				
			}catch (SQLException e) {
				conn.rollback(sp1);
				conn.commit();
				e.printStackTrace();
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
