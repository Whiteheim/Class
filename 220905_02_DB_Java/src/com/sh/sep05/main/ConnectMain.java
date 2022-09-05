package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// cmd ��� sqlplus��� ���α׷����� oracleDB����
//	=> cmd����� �ʹ� ����
// ����ǰ ���� : orange, toad, eclipse, dbeaver, sqldeveloper, ...

// Socket ��� / HTTP���

// DB������ ��� : Java�� ����Ǿ�������, �̿ϼ� ����
//		DB ����Ŀ�� ���� ����Ŀ���� ��Ź���� ���ݾ� �ٸ�
//		������ DB�� ���� ���ݾ� ���� �ʿ�

// oracleDB����� -> �̿� �������� ����
//		=> ojdbc8.jar�� ���� ����Ǿ�����

//		ojdbc8.jar�� ������Ʈ�� �߰��ϸ� �ڵ����� ��� ����


public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// ���� �� DB ���� �ּ�(DB����Ŀ ���� ������ ���̰� ����)
			// Data Source Explorer -> ���� �̸��� ��Ŭ��
			// -> properties -> Driver properties -> Connection URL ����
			
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			
			// ojdbc8.jar�� ����� ���
			con = DriverManager.getConnection(addr, "heim", "1234");
			System.out.println("��");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close(); 			// ö���� close ���� �����־��
									// �ٸ������ ��� ������
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}



































