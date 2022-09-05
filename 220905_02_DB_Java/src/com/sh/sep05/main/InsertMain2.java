package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		
		Connection con = null; //연결 객체
		PreparedStatement pstmt = null;// 객체와 연결
		
		try {
			// db서버와 연결
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			con = DriverManager.getConnection(addr, "heim", "1234");
			System.out.println("연결됨");

			Scanner k = new Scanner(System.in);
			System.out.print("마트명 : ");
			String name = k.next();
			System.out.print("지점명 : ");
			String location = k.next();
			System.out.print("평수 : ");
			int space = k.nextInt();
			System.out.print("주차가능 수 : ");
			int parking = k.nextInt();
			
			
			// SQL문 입력
			// Java변수의 값이 들어갈 자리에 '?'로 입력
			
			String sql = "insert into mart values "
					+ "(mart_seq.nextval, "
					+ "?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);

			
			
			// '?'에 값 채우기 : pstmt.setXXX(물음표번호, 값)
			// xxx = 자료형, 물음표의 번호는 1부터 시작
			pstmt.setString(1, name);
			// sql변수의 첫번째 물음표는 String 인 name의 값을 넣어라
			pstmt.setString(2, location);
			pstmt.setInt(3, space);
			pstmt.setInt(4, parking);
			
			// 입력받은 값 전송 / 실행/ 결과받기
			// sql의 실행에 대한 잡업 때문에, 영향을 받은 데이터의 수가 리턴
//			int dataCount = pstmt.executeUpdate();
//			if (dataCount == 1) {
//				System.out.println("완료");
//			}
			if (pstmt.executeUpdate() == 1) { // 업데이트에 영향을 받을 값이
											 //mart의 하나의 값이라면 실행
				System.out.println("완료");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			pstmt.close();	// 매니저 먼저 닫기
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();	// 연결 객체 닫기 (순서 유의)
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
