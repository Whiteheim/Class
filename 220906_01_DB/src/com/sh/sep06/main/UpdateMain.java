package com.sh.sep06.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		// 매장 명 입력 -> 그 단어를 포함하는 모든 매장의 상품을 20% 할인된 가격으로 바꿈
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			con = DriverManager.getConnection(addr, "heim", "1234");
			Scanner k = new Scanner(System.in);
			System.out.println("매장명 : ");
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
				System.out.println("성공");
			} else {
				System.out.println("매장이 없습니다");
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




































