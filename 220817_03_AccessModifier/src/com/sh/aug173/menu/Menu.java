package com.sh.aug173.menu;

// 정리 

// 단축키 심기
// 		메뉴 -> Window -> Preferences -> 왼쪽 상단에 'keys' 검색
//		- 화면이 바뀌면 - 중앙 검색란에 'generate' 검색
//		-> generate ~ using field : ctrl + shift + space (생성자 오버로딩)
//		   generate ~ getters and setters : ctrl + shift +  Z or A (getter/setter)
//			binding 칸을 클릭 후 원하는 단축키를 입력


public class Menu {
	//1. 멤버변수
	private String name;
	private int price;
	
	//2. 기본 생성자
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	//3. 생성자 오버로딩 - ctrl + shift + space
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//4. getter and setter - ctrl + shift + A
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 5. 나머지 필요한 method들 작성
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
