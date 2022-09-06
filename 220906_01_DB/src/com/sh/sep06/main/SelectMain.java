package com.sh.sep06.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  			// java.sql
		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			
			con = DriverManager.getConnection(addr, "heim", "1234");
			
			String sql =  "select * from vegetable order by v_name";
			
			pstmt = con.prepareStatement(sql);
			
//			pstmt.executeUpdate() : �� ���� ������ �޾Ҵ°� (C, U, D)
//			pstmt.executeQuery()  : ������ (R)
			
//			select���� ������ ��� : ResultSet
//						List�� ����� ����
			
			rs = pstmt.executeQuery();
			//rs.next() : ���� �����ͷ� �Ѿ. xml����
			//				���� �����Ͱ� ������ true,
			//				���� �����Ͱ� ������ false ����
			while (rs.next()) {
				// rs.getxxx("�÷���") : ���� ��ġ�� �÷� �б�
				// rs.getxxx(�ε���) : ���x
				// xxx�� �ڷ���
				System.out.println(rs.getString(2)); // �ε����� : ���̺��� �÷� ����
				System.out.println(rs.getInt("v_weight"));
				System.out.println(rs.getInt("v_cost"));
				System.out.println("-----------------");
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();					// close ���� �� ���Ѽ� �ݾ��ֱ� (��Į�ڸ��� ó��)
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}




























