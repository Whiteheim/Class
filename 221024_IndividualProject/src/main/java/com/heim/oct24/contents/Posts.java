package com.heim.oct24.contents;

import java.util.List;

public class Posts {
	public List<Content> contents;
	
	public Posts() {
		// TODO Auto-generated constructor stub
	}

	public Posts(List<Content> contents) {
		super();
		this.contents = contents;
	}

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	
	
}
