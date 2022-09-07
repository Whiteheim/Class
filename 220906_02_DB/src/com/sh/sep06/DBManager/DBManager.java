package com.sh.sep06.DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	public static Connection connect() throws SQLException {
		String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
		return DriverManager.getConnection(addr, "heim", "1234");
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();							// C, U, D때는 필요 x
												// R(select문) 때만 필요
		} catch (Exception e) {				//e.printStackTrace(); 뺀 이유
											// insert하게되면 NullpointerException이 발생
											// 모든 Exception이 잡히도록 함
											// 메시지는 무시하려고 삭제함
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
		
	}
	
	
	
	
	
	
}
