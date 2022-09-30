package com.sh.sep30.fruit;

// 객체를 여러개 등록해서 사용 
//					-> src/main/resources -> xxxbeans.xml 생성 후 사용
// Singleton pattern
//		root-context.xml	: Tomcat에 실려 있는 프로젝트 전체에 영향

//		servlet-context.xml	: 현재 사용중인 프로젝트에 영향
//					src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml
public class Fruit {
	private String name;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

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
	
	
}
