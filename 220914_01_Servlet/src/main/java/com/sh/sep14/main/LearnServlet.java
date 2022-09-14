package com.sh.sep14.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 현재 class에 main이 없음
//	main은 tomcat의 내부에 존재

// Servlet (Server + Application)

// @XXX : Annotation
//	->직접 구현해야 하는 모든 것들을 자동으로 처리해줌

@WebServlet("/LearnServlet") // LearnServlet을 Tomcat에 등록 (*** 지우면 프로그램이 정지됨)
public class LearnServlet extends HttpServlet {
	// HttpServlet 클래스에 있는 기능을 상속받음 (요청 받으면 응답 하기)
	//	+ 기능을 추가
	
	// 작업하면서 버전을 표시하기 위해 만들어짐 (지워도 무방)
	private static final long serialVersionUID = 1L;
      
	// 생성자 - 이 LeanServlet 객체는 tomcat이 생성함
	// 사용 빈도 낮음 (지워도 무방)
    public LearnServlet() {
        super();
    }

    // event-driven-programming (이벤트 기반의 프로그래밍)
    // Tomcat이 실행중 -> LeanServlet을 실행 
    //		-> tomcat이 LearnServlet이라는 객체를 만들어서 tomcat이 종료 될 때까지 반복실행
    //		-> 이벤트가 발생하면 그것을 처리하고 루프로 복귀함
    
    
    // ** 핵심부분 ↓
    // 루프를 돌다가 클라이언트가 Servlet으로 GET방식의 요청을 하면 
    // Tomcat이 doGet메소드를 자동으로 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// 루프를 돌다가 클라이언트가 Servlet으로 GET방식의 요청을 하면 
	// Tomcat이 doPost메소드를 자동으로 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



































