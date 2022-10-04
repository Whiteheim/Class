package com.heim.oct04.test;

import java.util.Date;

public class Test {
	private String t_name;
	private Date t_date;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String t_name, Date t_date) {
		super();
		this.t_name = t_name;
		this.t_date = t_date;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Date getT_date() {
		return t_date;
	}

	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}
	
	
}
