package com.heim.oct04.student;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// SqlsessionTemplate
//	Sqlsession의 하위 클래스 
//	(public class SqlsessionTemplate implements Sqlsession)의 구조
//		-> Sqlsession의 기능은 다 들어있음 
//			+ 여러 추가기능 : 자동 연결 / 해제, 자동 commit

@Service
public class StudentDAO {
	
	@Autowired
	private SqlSession ss; // servlet-context와 연결 (DB 기능 연결)
	//										┌ 버튼 눌렀을때 요청
	public void regStudent(Student s, HttpServletRequest req) {
		try {
			// 연결 - 자동 (SqlsessionTemplate 때문) - connect, close 필요 x
			
			// Javq -> 값 받아오기 & 객체로 만들기 => Spring이 
			
			// 내용 출력
//			System.out.println(s.getS_name());
//			System.out.println(s.getS_nickname());
			
			// SQL 수행 - MyBatis 활용
			//	interface 를 가져옴 (Java와 SQL 연동)
			StudentMapper sm = ss.getMapper(StudentMapper.class);
			
			// interface에 있는 abstract method (추상 메소드)호출
			// -자동-> 연결이 되어있는 mapper.xml의 해당 부분 실행
			if (sm.regStudent(s) == 1) {
				req.setAttribute("r", "등록완료");
				// ss.commit(); -> sql 문에 반영하는 수식 (입력하지 않아도 자동 실행)
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "등록실패");
		}
	}
	
	public void getAllStudent(HttpServletRequest req) {
		try {
//			List<Student> student = ss.getMapper(StudentMapper.class).getAllStudent();
//			req.setAttribute("student", student);
			req.setAttribute("student", ss.getMapper(StudentMapper.class).getAllStudent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


































































