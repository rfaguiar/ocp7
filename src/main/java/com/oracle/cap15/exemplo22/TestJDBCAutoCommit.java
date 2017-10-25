package com.oracle.cap15.exemplo22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TestJDBCAutoCommit {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(),
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());) {
			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			stmt.execute("INSERT INTO AUTHOR VALUES (1031, 'Rachel', 'McGinn')");
			stmt.execute("INSERT INTO BOOK VALUES ('0554466789', 'My American Dolls', '2012-08-31', 'Paperback', 7.95)");
			stmt.execute("INSERT INTO BOOKS_BY_AUTHOR VALUES (1031, '0554466789')");
			conn.commit();
			System.out.println("REGISTROS INSERIDOS");
			
		}catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}
