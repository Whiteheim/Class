package com.sh.sep06.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		// ���� �� �Է� -> �� �ܾ �����ϴ� ��� ������ ��ǰ�� 20% ���ε� �������� �ٲ�
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			con = DriverManager.getConnection(addr, "heim", "1234");
			Scanner k = new Scanner(System.in);
			System.out.println("����� : ");
			String name = k.next();
			
			String sql = "update vegetable "
					+ "set v_cost = v_cost * 0.8 "
					+ "where v_m_no in ("
					+ "select m_no"
					+ "	from mart"
					+ "	where m_name like '%'||?||'%')";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			if (pstmt.executeUpdate() >= 1) {
				System.out.println("����");
			} else {
				System.out.println("������ �����ϴ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}




































