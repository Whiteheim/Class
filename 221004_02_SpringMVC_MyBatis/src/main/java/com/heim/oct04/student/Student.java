package com.heim.oct04.student;

import java.math.BigDecimal;

// MyBatis : ORM(Object Relationship Mapping) Framework
//	-> 객체와 데이터베이스의 데이터를 자동으로 연결(맵핑) 해주는 Framework
//	-> 결과를 자바객체로 담아줌
//		DB컬럼명 = Java멤버변수명
//		Oracle) number -> Java) BigDecimal

// Spring MVC : 요청파라미터를 자동으로 객체에 담아줌
//		요청파라미터명 = Java 멤버변수명

// Spring MVC + MyBatis + Maven
//		요청파라미터명 = Java멤버변수명 = DB컬럼명 *** 모두 동일하게 설정해야 데이터가 자동으로 입력됨
//		Oracle) number -> Java) BigDecimal



public class Student {
	private BigDecimal s_no;
	private String s_name;
	private String s_nickname;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(BigDecimal s_no, String s_name, String s_nickname) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_nickname = s_nickname;
	}

	public BigDecimal getS_no() {
		return s_no;
	}

	public void setS_no(BigDecimal s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_nickname() {
		return s_nickname;
	}

	public void setS_nickname(String s_nickname) {
		this.s_nickname = s_nickname;
	}
	
	
}
