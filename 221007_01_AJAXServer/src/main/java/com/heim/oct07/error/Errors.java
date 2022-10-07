package com.heim.oct07.error;

import java.util.List;

// Error 하나하나를 list의 형태로 내보내기 위해 새로운 JavaBean 생성
public class Errors {
	public List<Error> error;
	
	public Errors() {
		// TODO Auto-generated constructor stub
	}

	public List<Error> getError() {
		return error;
	}

	public void setError(List<Error> error) {
		this.error = error;
	}

	public Errors(List<Error> error) {
		super();
		this.error = error;
	}
	
	
}
