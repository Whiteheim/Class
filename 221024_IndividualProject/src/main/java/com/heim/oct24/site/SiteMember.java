package com.heim.oct24.site;

public class SiteMember {
	private String s_name;
	private String s_nickName;
	private String s_birth;
	private String s_id;
	private String s_pw;
	private String s_mail;
	private String s_phoneNumber;

	public SiteMember() {
		// TODO Auto-generated constructor stub
	}

	public SiteMember(String s_name, String s_nickName, String s_birth, String s_id, String s_pw, String s_mail,
			String s_phoneNumber) {
		super();
		this.s_name = s_name;
		this.s_nickName = s_nickName;
		this.s_birth = s_birth;
		this.s_id = s_id;
		this.s_pw = s_pw;
		this.s_mail = s_mail;
		this.s_phoneNumber = s_phoneNumber;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_nickName() {
		return s_nickName;
	}

	public void setS_nickName(String s_nickName) {
		this.s_nickName = s_nickName;
	}

	public String getS_birth() {
		return s_birth;
	}

	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_pw() {
		return s_pw;
	}

	public void setS_pw(String s_pw) {
		this.s_pw = s_pw;
	}

	public String getS_mail() {
		return s_mail;
	}

	public void setS_mail(String s_mail) {
		this.s_mail = s_mail;
	}

	public String getS_phoneNumber() {
		return s_phoneNumber;
	}

	public void setS_phoneNumber(String s_phoneNumber) {
		this.s_phoneNumber = s_phoneNumber;
	}
	
	
}