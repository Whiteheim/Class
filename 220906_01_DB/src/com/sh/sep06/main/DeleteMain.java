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
			
			// 상품명 입력 - 입력한 내용을 포함하는 상품명의 정보 삭제
			Scanner k = new Scanner(System.in);
			System.out.println("삭제할 상품명 : ");
			String vegetable = k.next();
			
			// 이곳은 자바의 영역 -> % = 포맷할 때 사용
			//						-> %?%를 인식하지 못함
			// DB에서 문자열을 붙일때 쓰는 파이프 || 사용
			String sql = "delete vegetable "
					+ "where v_name like '%'||?||'%'";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vegetable);
			if (pstmt.executeUpdate() >= 1) { 
				// 입력받은 데이터에 영향을 받는 수가 1개 이상이라면
				System.out.println("성공");
			} else { // 영향을 받는 데이터가 없다면
				System.out.println("없는 제품입니다");
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






































