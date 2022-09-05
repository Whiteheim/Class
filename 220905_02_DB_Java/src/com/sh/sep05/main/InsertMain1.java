package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	public static void main(String[] args) {
		// SQL문을 사용
		// -> DB서버로 전송
		// -> DB서버에서 SQL문을 실행
		// -> 그 결과를 자바로 받아올 수 있어야함

		Connection con = null;

		try {
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";

			con = DriverManager.getConnection(addr, "heim", "1234");

//			System.out.println("완료");
			
			// 주의점 
			// 줄을 바꿔 입력할 때 띄어스기 주의! (줄 바꿀 때 띄어쓰기 하나 추가)
			// 소괄호 뒤에 ';' 입력 X
			String sql = "insert into vegetable "
					+ "values(vegetable_seq.nextval, "
					+ "'마늘', 8000, 5000, 2)";
			
			// 서버에 전송 / 실행 / 결과 받아오기 를 총괄하는 매니저 존재
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate(); // 서버에 전송 / 데이터 전송 / 실행 / 결과 받기
			
			
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
