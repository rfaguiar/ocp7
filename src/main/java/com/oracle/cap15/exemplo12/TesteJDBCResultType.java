package com.oracle.cap15.exemplo12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.cap15.ConstantesBD;

public class TesteJDBCResultType {
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(ConstantesBD.URL.toString(),
						ConstantesBD.USER.toString(), ConstantesBD.PASSWORD.toString());
					Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
			
			String query = "SELECT * FROM CUSTOMER";
			
			ResultSet rs = stmt.executeQuery(query);
			if (rs.last()) {//vai para ujltimo
				System.out.println(rs.getObject(1));
				int rowCount = rs.getRow();//total linhas
				System.out.println(rowCount);
				rs.beforeFirst();//vai para antes do primeiro
				rs.next();//vai para primeiro
				System.out.println(rs.getObject(1));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
