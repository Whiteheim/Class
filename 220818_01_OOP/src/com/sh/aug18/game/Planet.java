package com.sh.aug18.game;

import com.sh.aug18.character.Character;

public class Planet {
	private String name;
	private int size;
	private boolean visible;

	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisable() {
		return visible;
	}

	public void setVisable(boolean visable) {
		this.visible = visable;
	}
	
	public void add(Character c) {
		System.out.printf("%s에 %s이(가) 입주! \n", name, c.getName());
	}
	


}
