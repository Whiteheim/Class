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
			rs.close();							// C, U, D���� �ʿ� x
												// R(select��) ���� �ʿ�
		} catch (Exception e) {				//e.printStackTrace(); �� ����
											// insert�ϰԵǸ� NullpointerException�� �߻�
											// ��� Exception�� �������� ��
											// �޽����� �����Ϸ��� ������
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
