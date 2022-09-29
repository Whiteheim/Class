package com.sh.sep28.Model;

import java.io.File;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sh.sep28.DBManager.DBManager;
import com.sh.sep28.info.Member;

public class MemberDAO {

	// 가입 하기 위한 method
	public static void join(HttpServletRequest req) {
		// 파일 업로드 시도
		// 10 * 1024 * 1024 (10메가) / 파일 크기 초과시 회원가입 실패
		String path = null;
		MultipartRequest mr = null;
		try {
			path = req.getServletContext().getRealPath("img");
			mr = new MultipartRequest(req, path, 10 * 1024 * 1024, 
					"EUC-KR", new DefaultFileRenamePolicy());

		} catch (Exception e) {// 파일 업로드 실패
			e.printStackTrace();
			req.setAttribute("r", "파일의 용량이 너무 큽니다.");
			return; // 업로드에 실패하면 남은 DB작업 중단 (강제종료) // break는 반복문 종료시 사용
		}

		// 파일 업로드 성공시 DB 작업 계속 진행
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect("myPool");

			String id = mr.getParameter("m_id");
			String pw = mr.getParameter("m_pw");
			String pN = mr.getParameter("m_phoneNum");
			String y = mr.getParameter("m_y");
			int m = Integer.parseInt(mr.getParameter("m_m")); // 두자리 숫자로 받아와야 해서 int 사용
			int d = Integer.parseInt(mr.getParameter("m_d"));
			String bd = String.format("%s%02d%02d", y, m, d);
			String img = mr.getFilesystemName("m_picture");
			img = URLEncoder.encode(img, "EUC-KR").replace("+", " "); // 파일 명 빈부분을 + 로 처리하지 않게

			String sql = "insert into information values (?, ?, ?, to_date(?, 'YYYYMMDD'), ?)";

			pstmt = con.prepareStatement(sql); // sql문 실행

			// ?의 빈 값 채우기
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, pN);
			pstmt.setString(4, bd);
			pstmt.setString(5, img);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "가입이 완료되었습니다.");
			}

		} catch (Exception e) { // 중복된 아이디 / DB서버 연결상태 문제 등
			e.printStackTrace();
			// 서버 문제로 회원가입은 실패, 사진파일은 업로드 된 상태
			// 업로드된 사진 파일 삭제 (Java이용, 파일명에는 한글처리 x)
			File f = new File(path + "/" + mr.getFilesystemName("m_picture"));
			f.delete();
			req.setAttribute("r", "가입 실패 (서버문제)");
		}
		DBManager.close(con, pstmt, null);

	}

	public static void login(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect("myPool");
			req.setCharacterEncoding("EUC-KR");
			String id = req.getParameter("m_id");
			String pw = req.getParameter("m_pw");

			// String sql = "select * from information";
			// String sql = "select * from information where m_id = ? and m_pw = ?";
			// 해킹 기법 중 SQL Injection 이 있음
			// 보안상 취약점을 이용해서 데이터 베이스가 비정상적인 동작을 하게 하는 기법
			String sql = "select * from information where m_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // 데이터가 있는지 , 있다면 그 데이터를 가리켜서
				String dbPw = rs.getString("m_pw");
				if (dbPw.equals(pw)) {
					Member m = new Member(rs.getString("m_id"), dbPw, rs.getString("m_phoneNum"), rs.getDate("m_bd"),
							rs.getString("m_picture"));
					req.getSession().setAttribute("loginMember", m);
					req.getSession().setMaxInactiveInterval(600);

					Cookie c = new Cookie("lastLoginId", id);
					c.setMaxAge(60 * 60 * 24 * 5); // 5일간 유지
					res.addCookie(c);
					req.setAttribute("r", "로그인 성공");
				} else {
					req.setAttribute("r", "로그인 실패 [비밀번호 비일치]");
				}
			} else { // 데이터가 없는 경우
				req.setAttribute("r", "로그인 실패 [존재하지 않는 ID]");

			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인 실패 [서버 문제]");
		}
		DBManager.close(con, pstmt, rs);
	}

	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if (m != null) {
			// 로그인에 성공 / 유지 시
			req.setAttribute("login", "loginSuccess.jsp");
			return true;
		}
		// 로그인 상태가 아니거나 실패한 경우
		req.setAttribute("login", "login.jsp");
		return false;

	}

	public static void logout(HttpServletRequest req) {
//		req.getSession().setMaxInactiveInterval(-1); 	// 로그인의 유지시간을 -1로 줘서 세션을 끊어버림
		// 다른 세션도 다 끊기는 불상사
		// Member에 대한 Session만 null로 바꿔주기
		req.getSession().setAttribute("loginMember", null);

	}

	// 회원 정보 수정
	public static void collectInfo(HttpServletRequest req) {
		String path = null;
		MultipartRequest mr = null;
		try {
			path = req.getServletContext().getRealPath("img");
			mr = new MultipartRequest(req, path, 10 * 1024 * 1024, 
					"EUC-KR", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "정보 수정 실패 [사진용량이 너무 큽니다.]");
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect("myPool");
			String pw = mr.getParameter("c_pw");
			String pN = mr.getParameter("c_phoneNum");
			String y = mr.getParameter("c_y");
			int m = Integer.parseInt(mr.getParameter("c_m"));
			int d = Integer.parseInt(mr.getParameter("c_d"));
			String bd = String.format("%s%02d%02d", y, m, d);
			String img = mr.getFilesystemName("c_picture");
			img = URLEncoder.encode(img, "EUC-KR").replace("+", " ");

			String sql = "update information set m_pw = ?, m_phoneNum = ?, "
					+ "m_bd = to_date(?, 'YYYYMMDD'), m_picture = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, pN);
			pstmt.setString(3, bd);
			pstmt.setString(4, img);
				

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "정보 변경 완료");
			} 
			// 각각의 항목만 삭제하도록 하려면 각각의 method를 만들어주어야함
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "변경하실 정보를 입력해 주세요.");
			return;
		}
		DBManager.close(con, pstmt, null);
	}

	// 정보 삭제
	public static void delete(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			String id = req.getParameter("c_id");
			String sql = "delete from information where m_id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "회원정보 삭제 완료");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
