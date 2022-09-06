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
			
//			pstmt.executeUpdate() : 몇 개나 영향을 받았는가 (C, U, D)
//			pstmt.executeQuery()  : 데이터 (R)
			
//			select문을 수행한 결과 : ResultSet
//						List와 비슷한 느낌
			
			rs = pstmt.executeQuery();
			//rs.next() : 다음 데이터로 넘어감. xml느낌
			//				다음 데이터가 있으면 true,
			//				다음 데이터가 없으면 false 리턴
			while (rs.next()) {
				// rs.getxxx("컬럼명") : 현재 위치의 컬럼 읽기
				// rs.getxxx(인덱스) : 사용x
				// xxx는 자료형
				System.out.println(rs.getString(2)); // 인덱스값 : 테이블의 컬럼 순서
				System.out.println(rs.getInt("v_weight"));
				System.out.println(rs.getInt("v_cost"));
				System.out.println("-----------------");
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rs.close();					// close 순서 잘 지켜서 닫아주기 (데칼코마니 처럼)
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




























