package com.heim.oct24.contents;

import com.sun.xml.internal.txw2.annotation.XmlElement;

public class Comment {
	private String r_num;
	private String r_writer;
	private String r_comment;
	private String r_date;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String r_num, String r_writer, String r_comment, String r_date) {
		super();
		this.r_num = r_num;
		this.r_writer = r_writer;
		this.r_comment = r_comment;
		this.r_date = r_date;
	}

	public String getR_num() {
		return r_num;
	}

	public void setR_num(String r_num) {
		this.r_num = r_num;
	}

	public String getR_writer() {
		return r_writer;
	}
	
	@XmlElement
	public void setR_writer(String r_writer) {
		this.r_writer = r_writer;
	}

	public String getR_comment() {
		return r_comment;
	}
	
	@XmlElement
	public void setR_comment(String r_comment) {
		this.r_comment = r_comment;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	
	
}
