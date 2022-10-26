package com.heim.oct24.dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// ���� JDBC ���α׷� ���� -> DBMS�� ���� �۾�
// Ŭ���̾�Ʈ�κ��� ��û�� ���� ������ DB������ �����ϱ� ���� 
// Connection ��ü�� ���� ����

// ����
//		1. Connection ������ ���� �ð��� �ʿ��� ����
//		2. ���ʿ��� ���ῡ ���� ���� �ڿ� ����

// ���� ���� -> DBCP (DataBase Connection Pool)
//		�������� DB Connection�� �ϳ��� Pool�� ��Ƴ��� ����
//		�ʿ��� ������ Pool���� �ҷ��ٰ� ����ϸ� O
//		����, ������ �� �ִ� Connection�� ���ٸ�, Connection ��ü�� ��ȯ�� ������
//			Ŭ���̾�Ʈ ��� ���·� ��ȯ
//		����� ���� Connection ��ü�� �ٽ� Pool�� ��ȯ

//		JNDI(Java Naming and Directory Interface)

// DataSource : Connection Pool�� Connection�� �����ϱ� ���� ��ü
//		lookup method�� ���� Connection�� �����ϰ�, Connection��ü�� ������ �� ���� 

public class DBManager {
	public static Connection connect(String poolName) throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/" + poolName);
		return ds.getConnection();
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
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

































