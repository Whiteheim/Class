package com.sh.aug18.character;

import com.beaver.aug181.avengers.Avengers;

public class Character {
	private String name;
	private Avengers hero; // 영웅 불러오기
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("치즈버거나 사와");
	}
	
	public void helpAaaaa() {
		hero.attack();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
