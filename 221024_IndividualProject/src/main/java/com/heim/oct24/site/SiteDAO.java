package com.heim.oct24.site;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiteDAO {

	@Autowired
	private SqlSession ss;

	// 회원가입 멤버 등록
	public void signUpMember(SiteMember sm, HttpServletRequest req) {
		try {
			SiteMapper smp = ss.getMapper(SiteMapper.class);
			if (smp.signUpMember(sm) == 1) {
				req.setAttribute("r", "회원가입이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "회원가입에 실패하였습니다.");
		}
	}

	public void loginMember(SiteMember sm, HttpServletRequest req, HttpServletResponse res) {
		try {
			String pw = req.getParameter("s_pw");
			SiteMapper smp = ss.getMapper(SiteMapper.class);
			if (smp.siteMember() != null) {
			String dbPw = sm.getS_pw();
			if (pw.equals(dbPw)) {
				req.getSession().setAttribute("loginMember", smp);
				
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
		}
		
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






















































