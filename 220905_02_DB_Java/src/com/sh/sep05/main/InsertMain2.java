package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		
		Connection con = null; //���� ��ü
		PreparedStatement pstmt = null;// ��ü�� ����
		
		try {
			// db������ ����
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			con = DriverManager.getConnection(addr, "heim", "1234");
			System.out.println("�����");

			Scanner k = new Scanner(System.in);
			System.out.print("��Ʈ�� : ");
			String name = k.next();
			System.out.print("������ : ");
			String location = k.next();
			System.out.print("��� : ");
			int space = k.nextInt();
			System.out.print("�������� �� : ");
			int parking = k.nextInt();
			
			
			// SQL�� �Է�
			// Java������ ���� �� �ڸ��� '?'�� �Է�
			
			String sql = "insert into mart values "
					+ "(mart_seq.nextval, "
					+ "?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);

			
			
			// '?'�� �� ä��� : pstmt.setXXX(����ǥ��ȣ, ��)
			// xxx = �ڷ���, ����ǥ�� ��ȣ�� 1���� ����
			pstmt.setString(1, name);
			// sql������ ù��° ����ǥ�� String �� name�� ���� �־��
			pstmt.setString(2, location);
			pstmt.setInt(3, space);
			pstmt.setInt(4, parking);
			
			// �Է¹��� �� ���� / ����/ ����ޱ�
			// sql�� ���࿡ ���� ��� ������, ������ ���� �������� ���� ����
//			int dataCount = pstmt.executeUpdate();
//			if (dataCount == 1) {
//				System.out.println("�Ϸ�");
//			}
			if (pstmt.executeUpdate() == 1) { // ������Ʈ�� ������ ���� ����
											 //mart�� �ϳ��� ���̶�� ����
				System.out.println("�Ϸ�");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			pstmt.close();	// �Ŵ��� ���� �ݱ�
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();	// ���� ��ü �ݱ� (���� ����)
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
