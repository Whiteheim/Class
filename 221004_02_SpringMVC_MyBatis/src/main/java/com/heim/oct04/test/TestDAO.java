package com.heim.oct04.test;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	@Autowired
	private SqlSession ss;
	
	public void regTest(Test t, HttpServletRequest req) {
		
		try {
			// View 파라미터 3개 (t_y, t_m, t_d -> t_date) 
			String t_y = req.getParameter("t_y");
			
			// 2022 1 1 -> SimpleDateFormat
			// 202211 -> 2022년 11월 / 2022년 1월 1일?
			int t_m = Integer.parseInt(req.getParameter("t_m"));
			int t_d = Integer.parseInt(req.getParameter("t_d"));
			
			String t_date2 = String.format("%s%02d%02d", t_y, t_m, t_d); // 20220101
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date t_date = sdf.parse(t_date2);
			t.setT_date(t_date);
			
			if (ss.getMapper(TestMapper.class).regTest(t) == 1) {
				req.setAttribute("testr", "등록완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("testr", "등록실패");
		}
	}
	
	public void getAllTest(HttpServletRequest req) {
		try {
			req.setAttribute("tests", ss.getMapper(TestMapper.class).getAllTest());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 파일 처리시 cos.jar 사용
	// 	1. req.getParameter() -> mr.getParameter() 사용
	// 	2. 실행되는 서버상에서 파일이 업로드 되는 경로
	//		String path = req.getServletcontext().getRealPath("img"); => Spring에서는 사용 불가
	//		String path = req.getSession().getServletcontext().getRealPath("resources/img");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
