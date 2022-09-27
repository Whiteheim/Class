package com.sh.sep26.home;

// 사과를 찍어 낼 틀

public class Apple {
	private String a_location;
	private String a_name;
	private String a_color;
	private int a_price;
	private String a_flavor;
	// 테이블의 목록 이름과 같도록
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String a_location, String a_name, String a_color, int a_price, String a_flavor) {
		super();
		this.a_location = a_location;
		this.a_name = a_name;
		this.a_color = a_color;
		this.a_price = a_price;
		this.a_flavor = a_flavor;
	}

	public String getA_location() {
		return a_location;
	}

	public void setA_location(String a_location) {
		this.a_location = a_location;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_color() {
		return a_color;
	}

	public void setA_color(String a_color) {
		this.a_color = a_color;
	}

	public int getA_price() {
		return a_price;
	}

	public void setA_price(int a_price) {
		this.a_price = a_price;
	}

	public String getA_flavor() {
		return a_flavor;
	}

	public void setA_flavor(String a_flavor) {
		this.a_flavor = a_flavor;
	}
	
	
	
	
	
}
