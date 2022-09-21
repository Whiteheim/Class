package com.beaver.sep21.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. Servlet(Controller) 실행시 forward 방식으로 HTML 실행후 사용자에게 출력
//		-> 사용자가 HTML에서 데이터를 입력 
//			-> 입력받은 값은 POST방식으로 Controller에 요청
//				* HTML파일과 JSP파일을 모두 사용해도 무방

// 2. Controller에서 Doctor객체(Model)의 Method를 호출해 요청된 값을 입력
//		-> Doctor 객체에서 요청된 값으로 수식을 계산
//			-> 계산된 데이터를 Guest객체에 담아 Request에 등록

// 3. Controller에서 Request에 등록된 값을 JSP에 forward방식으로 입력후 출력 

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("BMIInput.html").forward(request, response);
		// 첫 실행시 입력받는 화면 출력
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// BMI 계산 기능 부재 (의사와 손님 객체 생성)
		Doctor.calculate(request); 
		// 출력 전 의사 객체를 호출해 html에서 입력받은 데이터를 계산
		request.getRequestDispatcher("BMIOutput.jsp").forward(request, response);
		// html에서 post방식으로 보낸 데이터를 jsp 파일로 보내 출력
	}

}
