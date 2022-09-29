package com.sh.sep28.info;

import java.util.Date;

public class Member {
	private String m_id;
	private String m_pw;
	private String m_phoneNum;
	private Date m_bd;
	private String m_picture;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String m_id, String m_pw, String m_phoneNum, Date m_bd, String m_picture) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_phoneNum = m_phoneNum;
		this.m_bd = m_bd;
		this.m_picture = m_picture;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_phoneNum() {
		return m_phoneNum;
	}

	public void setM_phoneNum(String m_phoneNum) {
		this.m_phoneNum = m_phoneNum;
	}

	public Date getM_bd() {
		return m_bd;
	}

	public void setM_bd(Date m_bd) {
		this.m_bd = m_bd;
	}

	public String getM_picture() {
		return m_picture;
	}

	public void setM_picture(String m_picture) {
		this.m_picture = m_picture;
	}
	
	
	
}
