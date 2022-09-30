package com.sh.sep30.calc;


// 요청 파라미터과 JavaBean 멤버변수명을 동일하게 지정하기 + DB 컬럼명
// 		1. 헷갈리지 않음
//		2. 자동으로 요청파라미터의 값을 JavaBean의 객체에 담는것이 가능
public class CalcResult {
	private String n;
	private int x;
	private int y;
	
	public CalcResult() {
		// TODO Auto-generated constructor stub
	}

	public CalcResult(String n, int x, int y) {
		super();
		this.n = n;
		this.x = x;
		this.y = y;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
