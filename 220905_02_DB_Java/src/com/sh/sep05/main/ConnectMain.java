package com.sh.sep05.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// cmd 기반 sqlplus라는 프로그램으로 oracleDB제어
//	=> cmd기반은 너무 불편
// 사제품 등장 : orange, toad, eclipse, dbeaver, sqldeveloper, ...

// Socket 통신 / HTTP통신

// DB서버와 통신 : Java에 내장되어있으나, 미완성 상태
//		DB 메이커가 많고 메이커별로 통신방법이 조금씩 다름
//		연결할 DB에 맞춰 조금씩 조정 필요

// oracleDB사용중 -> 이에 맞춤으로 조정
//		=> ojdbc8.jar에 전부 내장되어있음

//		ojdbc8.jar를 프로젝트에 추가하면 자동으로 사용 가능


public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// 연결 할 DB 서버 주소(DB메이커 마다 형식의 차이가 있음)
			// Data Source Explorer -> 서버 이름에 우클릭
			// -> properties -> Driver properties -> Connection URL 복사
			
			String addr = "jdbc:oracle:thin:@203.252.32.73:1521:xe";
			
			// ojdbc8.jar에 내장된 기능
			con = DriverManager.getConnection(addr, "heim", "1234");
			System.out.println("완");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close(); 			// 철저히 close 실행 시켜주어야
									// 다른사람이 사용 가능함
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}



































