package com.sh.sep30.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

// 멤버변수가 없으면 : Static method 기반
// M / DAO에 게시판같은 기능을 구현 한다면 
// 숫자를 카운트 해주는 멤버 변수가 필요
// 		-> static 기반의 method는 사용 불가 -> 객체를 만들어서 사용
//		-> 새로고침 or 다시 요청 => calculate.do로 요청할 때 마다 새로운 cDAO(controller 확인)가 생성됨
//		-> 메모리 폭발 가능(메모리를 계속 사용하게 됨, 비효율적, allCalcCount 기능 불가)

// ==> CalcDAO를 singleton 처리

// Spring식의 singleton 처리방법
@Service // servlet-context.xml에 CalcDAO 객체 하나를 등록해놓은 효과
public class CalcDAO {
	private int allCalcCount;

//	public void calculate(CalcResult cr, HttpServletRequest req) {
//		allCalcCount++;
//		System.out.println(allCalcCount); // 계산을 진행할 때 마다 카운트
//		int add = cr.getX() + cr.getY();
//		System.out.println(add);
//		
//	}	==> 카운트가 쌓이지 않음

	public void calculate(CalcResult cr, HttpServletRequest req) {
		allCalcCount++;
		System.out.println(allCalcCount); // 계산을 진행할 때 마다 카운트
		int add = cr.getX() + cr.getY();
		req.setAttribute("r", add);
	}

}



















































































