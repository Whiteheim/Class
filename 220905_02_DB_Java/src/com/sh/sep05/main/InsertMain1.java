package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	public static void main(String[] args) {
		// SQL���� ���
		// -> DB������ ����
		// -> DB�������� SQL���� ����
		// -> �� ����� �ڹٷ� �޾ƿ� �� �־����

		Connection con = null;

		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";

			con = DriverManager.getConnection(addr, "heim", "1234");

//			System.out.println("�Ϸ�");
			
			// ������ 
			// ���� �ٲ� �Է��� �� ���� ����! (�� �ٲ� �� ���� �ϳ� �߰�)
			// �Ұ�ȣ �ڿ� ';' �Է� X
			String sql = "insert into vegetable "
					+ "values(vegetable_seq.nextval, "
					+ "'����', 8000, 5000, 2)";
			
			// ������ ���� / ���� / ��� �޾ƿ��� �� �Ѱ��ϴ� �Ŵ��� ����
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate(); // ������ ���� / ������ ���� / ���� / ��� �ޱ�
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
