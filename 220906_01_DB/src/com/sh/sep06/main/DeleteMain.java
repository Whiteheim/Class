package com.sh.sep06.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			con = DriverManager.getConnection(addr, "heim", "1234");
			
			// ��ǰ�� �Է� - �Է��� ������ �����ϴ� ��ǰ���� ���� ����
			Scanner k = new Scanner(System.in);
			System.out.println("������ ��ǰ�� : ");
			String vegetable = k.next();
			
			// �̰��� �ڹ��� ���� -> % = ������ �� ���
			//						-> %?%�� �ν����� ����
			// DB���� ���ڿ��� ���϶� ���� ������ || ���
			String sql = "delete vegetable "
					+ "where v_name like '%'||?||'%'";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vegetable);
			if (pstmt.executeUpdate() >= 1) { 
				// �Է¹��� �����Ϳ� ������ �޴� ���� 1�� �̻��̶��
				System.out.println("����");
			} else { // ������ �޴� �����Ͱ� ���ٸ�
				System.out.println("���� ��ǰ�Դϴ�");
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






































