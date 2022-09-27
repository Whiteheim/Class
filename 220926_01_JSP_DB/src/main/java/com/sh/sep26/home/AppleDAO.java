package com.sh.sep26.home;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import com.sh.sep26.manager.DBManager;

public class AppleDAO {
	
	private int allAppleCount; // 전체 사과 갯수 멤버변수
	
	private static final AppleDAO APPLEDAO = new AppleDAO();
	
	private AppleDAO() {
		// TODO Auto-generated constructor stub
	}

	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}
	
	// 모든 사과의 데이터 다 가져오기
	public void getAllApples(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			//sql문 작성
			String sql = "select * from sep26_apple order by a_price";
			
			pstmt = con.prepareStatement(sql);
			
			// C / U / D : pstmt.executeUpdate() 로 실행
			// 		=> 데이터가 몇 개 영향을 받았는지에 대해 나타냄
			// R : pstmt.executeQuery()로 실행
			//		=> select결과를 ResultSet으로 보내 사용
			
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			// 빈 배열 생성해서 Query문이 끝날 때 까지 정보를 받아와
			// arrylist에 하나씩 채워넣기
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apples.add(apple);
			}
			req.setAttribute("apples", apples);
		} catch(Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, rs);
	}
	
	public void insertApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect("myPool");
			
			req.setCharacterEncoding("EUC-KR");
			String location = req.getParameter("location");			
			String name = req.getParameter("name");			
			String color = req.getParameter("color");			
			int price = Integer.parseInt(req.getParameter("price"));			
			String flavor = req.getParameter("flavor");
			
			// <textArea>에서 줄바꿈 : \r\n
			// 웹페이지에서 줄바꿈 : <br>
			
			// sql문 (미완성) : 어느자리에 들어갈지 모름
			String sql = "insert into sep26_apple values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			pstmt.setString(2, name);
			pstmt.setString(3, color);
			pstmt.setInt(4, price);
			pstmt.setString(5, flavor);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[등록성공]");
				allAppleCount++;
			} 
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[등록실패]");
		}
		DBManager.close(con, pstmt, null);
	}
	
	// 총 데이터가 몇 개 인지
	public void countApples() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			String sql="select count(*) from sep26_apple";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next(); // executeQuery 후에 다음 데이터로 넘어가기
			
			// 가져온 데이터 변수에 담기
			allAppleCount = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, rs);
	}
	
	
	// DB에 대량의 데이터 존재 -> 해당 페이지 번호에 맞는 데이터만 가져오기
	public void getApples(int pageNo, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			// SQL을 수행하는데 필요한 값 챙기기
			
			// allAppleCount : 전체 사과 데이터 수
			int applePerPage = 4; // 한 페이지당 보여줄 사과 데이터의 수
			
			// 페이지 개수 가져오기 (결과값이 소수점으로 나온다면
			//	올림처리 하여 나머지 값도 보여줄 수 있도록 설정)
			// Math.ceil : 숫자 올림
			int pageCount = (int) Math.ceil(allAppleCount / (double) applePerPage);
			req.setAttribute("pageCount", pageCount);
			///////////////////////////////////////////////////////////////////
			int start = (applePerPage * (pageNo - 1)) + 1;
			int end = (pageNo == pageCount) ? allAppleCount : (start + applePerPage - 1);
			
			String sql = "select * from ( " 
					+ 		"select rownum as rn, a_location, a_color, a_flavor, a_price, a_name "
					+ 		"from ( "
					+ 				"select * "
					+ 				"from sep26_apple "
					+ 				"order by a_price "
					+ 			") "
					+ 		") "
					+ 	"where rn >= ? and rn <= ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apples.add(apple);
				
			}
			req.setAttribute("apples", apples);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		DBManager.close(con, pstmt, rs);
	}
	
	// 상세 정보 가져오기(primary key 이용)
	// 데이터를 제대로 가져오면 true, 실패했으면 false
	public boolean getAppleDetail(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			String location = req.getParameter("a_location"); // 지정해둔 primary key 값 가져오기
			// 테이블명 / 컬럼명 / SQL 오타 주의
			String sql = "select * from sep26_apple where a_location = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location); // ? 자리 채워주기
			rs = pstmt.executeQuery(); // resultSet에 결과 담기
			
			if (rs.next()) { // 데이터가 존재 한다면
				Apple apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				req.setAttribute("apple", apple); // 불러온 값을 attribute에 등록
				return true;// 일반적인 상황 : 데이터가 하나
 			}
			return false;	// 예외적인 상황 : 다른사람이 데이터를 삭제한 경우 (데이터가 없음)
		} catch (Exception e) {
			e.printStackTrace();
			return false;	// DB서버 상태가 안좋은 경우 (ex : 서버가 켜지지 않음)
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}
	
	public void deleteApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			String location = req.getParameter("a_location");
			String sql = "delete from sep26_apple where a_location = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			
			if (pstmt.executeUpdate() == 1) { // 변동 수 가 1이라면 
				req.setAttribute("r", "[삭제 성공]");
				allAppleCount--;
			} else {
				req.setAttribute("r", "[삭제 실패]");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, null);
	}
	
	public boolean update(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			
			req.setCharacterEncoding("EUC-KR");
			
			String location = req.getParameter("a_location");
			String name = req.getParameter("a_name");
			String color = req.getParameter("a_color");
			int price = Integer.parseInt(req.getParameter("a_price"));
			String flavor = req.getParameter("a_flavor");
			
			String sql = "update sep26_apple "
					+ "set a_color=?, a_name=?, a_price=?, a_flavor=? "
					+ "where a_location=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, color);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setString(4, flavor);
			pstmt.setString(5, location);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[수정 완료]");
				return true;
			} else {
				req.setAttribute("r", "[수정 실패]");
				return false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[수정 실패]");
			return false;
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






























