package com.heim.oct24.site;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.heim.oct24.dbmanager.DBManager;

@Service
public class SiteDAO {

	@Autowired
	private SqlSession ss;

	// 회원가입 멤버 등록
	public void signUpMember(SiteMember sm, HttpServletRequest req) {
		try {
			String y = req.getParameter("s_y");
			int m = Integer.parseInt(req.getParameter("s_m"));
			int d = Integer.parseInt(req.getParameter("s_d"));
			String birth = String.format("%s%02d%02d", y, m, d);

			sm.setS_birth(birth);

			SiteMapper smp = ss.getMapper(SiteMapper.class);
			if (smp.SUMember(sm) == 1) {
				req.setAttribute("r", "회원가입이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "회원가입에 실패하였습니다.");
		}
	}

	public static void main(String[] args) {
		SiteMember sm = new SiteMember();
		String dbPw = sm.getS_pw();
		System.out.println(dbPw);
	}
	
	// 로그인
	public void loginMember(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("mypool");
			String id = req.getParameter("s_id");
			String pw = req.getParameter("s_pw");
			String sql = "select * from db_siteMember where s_id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id); 
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String dbPw = rs.getString("s_pw");
				if (pw.equals(dbPw)) {
					SiteMember sm = new SiteMember
							(rs.getString("s_name"), rs.getString("s_nickName"), rs.getString("s_birth"),
									rs.getString("s_id"), dbPw, rs.getString("s_mail"), rs.getString("s_phoneNumber"));
					req.getSession().setAttribute("loginMember", sm);
					req.getSession().setMaxInactiveInterval(600);
					
					Cookie c = new Cookie("lastLoginId", req.getParameter("s_id"));
					c.setMaxAge(60 * 60 * 24 * 5);
					res.addCookie(c);
					req.setAttribute("r", "로그인 성공");
				} else {
					req.setAttribute("r", "비밀번호를 확인해주세요");
				}
			} else {
				req.setAttribute("r", "존재하지 않는 정보입니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} DBManager.close(con, pstmt, rs);

	}

	public boolean loginCheck(SiteMember sm, HttpServletRequest req) {
		sm = (SiteMember) req.getSession().getAttribute("loginMember");
		if (sm != null) {
			req.setAttribute("login", "loginSuccess.jsp");
			return true;
		}

		req.setAttribute("login", "loginView.jsp");
		return false;
	}

}
