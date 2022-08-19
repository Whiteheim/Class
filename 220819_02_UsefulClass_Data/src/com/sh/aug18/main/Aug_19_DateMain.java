package com.sh.aug18.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Date.java :1900년대에 만들어진 Class
//			Y2K에 관심이 없던 시절 (Year 2000 Problem) >> (k(kilo) = 1000)
//			현재 실정에는 맞지 않음
//			1900년대 당시, 용량이 적었기 때문에 연도 끝 2자리만 사용
//			1970년대 이전의 컴퓨터 : 속도가 느리고 장치의 용량이 적었다.
//			데이터를 아끼기 위해 연도 처리를 4byte가 아닌 2byte로 할당 (끝의 2자리)
//			오지않을거라 믿은 2000년이 와버려서 1900년, 2000년 끝의 두 자리가 00으로 인식되어 통일됨
//				-> 컴퓨터가 구분 불가능
//				-> 컴퓨터의 오작동 가능성 증가

// deprecated
//		세월이 흐르며, 컴퓨터도 발전 -> 옛날에 만들어 놓은것은 너무 구림
//		프로그래밍 언어도 업데이트가 되어야 하는데 중요한 메소드라 바로 없앨 수 없음
//		현재 자바버전에서는 사용 가능하나, 다음 버전에 대체될것이라는 의미 내포

// Date : 날짜 / 시간

public class Aug_19_DateMain {

	public static void main(String[] args) {
		// 기본생성 -> 현재 시간 / 날짜
		Date now = new Date();
		// 현재 시간 날짜 출력
		System.out.println(now);
		
		// 연도
		System.out.println(now.getYear() + 1900); // 1900년 기준으로 흐른 연도만큼 결과값이 나옴
		
		// 월
		System.out.println(now.getMonth() + 1); // 1월을 프로그래밍 언어의 시작인 0 부터 세어옴
		
		// 일
		System.out.println(now.getDate());
		
		// 요일
		System.out.println(now.getDay()); // 0 ~ 6 (일 ~ 토)
		
		// 요일 문자표기
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(day[now.getDay()] + "요일");
		System.out.println("=================================");
		//한글처리 / 날짜/ 시간 : 자주 등장
		
		// Date - 형식 지정 -> String으로 표현
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a k:mm" /*Locale.FRANCE*/);
		
		String s1 = sdf.format(now);
		System.out.println(s1);
		System.out.println("=================================");
		
		// 특정 시간 날짜
		Date d2 = new Date(93, 05, 16);
		System.out.println(d2);
		
		//String - 형식지정 -> Date타입
		try {
			String s2 = "1993/06/16";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			Date d3 = sdf2.parse(s2);
			System.out.println(d3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("=================================");

		// 10년 전 크리스마스의 요일은?
		try {
			String ch = "2012/12/25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
			Date d4 = sdf3.parse(ch);
//			System.out.println(d4);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String ch2 = sdf4.format(d4);
			System.out.println(ch2 + "요일");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
