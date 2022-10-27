package com.heim.oct24.site;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.compiler.ast.Member;
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
			String y = req.getParameter("s_y");
			int m = Integer.parseInt(req.getParameter("s_m"));
			int d = Integer.parseInt(req.getParameter("s_d"));
			
			String stringbirth = String.format("%s%02d%02d", y, m, d);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date dbirth = sdf.parse(stringbirth);
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
			String birth = sdf2.format(dbirth);
			
			sm.setS_birth(birth);

			SiteMapper smp = ss.getMapper(SiteMapper.class);
			if (smp.signUpMember(sm) == 1) {
				req.setAttribute("r", "회원가입이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "회원가입에 실패하였습니다.");
		}
	}

	// 로그인
	public void loginMember(SiteMember sm, HttpServletRequest req, HttpServletResponse res) {
		try {
			// mapper의 데이터를 불러오기
			List<SiteMember> lsm = ss.getMapper(SiteMapper.class).loginMembers(sm);

			if (lsm.size() != 0) {
				// siteMember의 0번째 데이터값을 받아옴
				SiteMember dbPw = lsm.get(0);
				if (dbPw.getS_pw().equals(sm.getS_pw())) {
					req.getSession().setAttribute("loginMember", dbPw);
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
		}

	}

	// 로그인 유무 확인
	public boolean loginCheck(SiteMember sm, HttpServletRequest req) {
		sm = (SiteMember) req.getSession().getAttribute("loginMember");
		if (sm != null) {
			req.setAttribute("login", "loginSuccess.jsp");
			return true;
		}
		req.setAttribute("login", "loginView.jsp");
		return false;
	}
	
	// 로그인 후 정보 수정
	public void correctInfo(SiteMember sm, HttpServletRequest req) {
		try {
			sm = (SiteMember) req.getSession().getAttribute("loginMember");
			sm.setS_nickName(req.getParameter("s_nickName"));
			sm.setS_pw(req.getParameter("s_pw"));
			sm.setS_mail(req.getParameter("s_mail"));
			sm.setS_phoneNumber(req.getParameter("s_phoneNumber"));
			
			if (ss.getMapper(SiteMapper.class).correctMember(sm) == null) {
				req.setAttribute("r", "정보 수정 완료");
				req.getSession().setAttribute("loginMember",sm);
			} else {
				req.setAttribute("r", "정보 수정 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 로그아웃
	public void logOutMember(HttpServletRequest req) {
		req.getSession().setAttribute("loginMember", null);
	}
	
	
	// 회원 탈퇴
	public void deleteMemberInfo(SiteMember sm, HttpServletRequest req) {
		try {
			sm = (SiteMember) req.getSession().getAttribute("loginMember");
			if (ss.getMapper(SiteMapper.class).deleteMember(sm) == null) {
				req.getSession().setAttribute("loginMember", null);
				req.setAttribute("r", "회원 탈퇴 완료");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





































































