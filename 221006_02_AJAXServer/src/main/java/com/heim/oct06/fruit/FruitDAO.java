package com.heim.oct06.fruit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {
	
	@Autowired
	private SqlSession ss; // DB관련 작업을 위해
	
	public void getAllFruit(HttpServletRequest req) {
		try {
			req.setAttribute("fruits", ss.getMapper(FruitMapper.class).getAllFruit());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Spring에서 XML 끌어오는 시스템 : XML AJAX Server
	//		현재) DB에 있는 과일 데이터 하나를 표현할 JavaBean(Fruit.java)를 가진 상태
	//			우리가 필요한 것)
	//				1. DB에 있는 '과일 테이블'을 표현할 수 있는 또 하나의 JavaBean이 필요
	//				2. Spring이 데이터를 XML로 바꿀 수 있도록
	//					각각의 JavaBean(Class명 위)에 @XmlRootElement annotation 달기
	//				3. Setter 위에 @XmlElement annotation 달기
	//					특정 데이터 -> XML형태로 바꾸는 것 : 마샬링 (Mashalling)
	public Fruits getXml(HttpServletRequest req) {
		List<Fruit> fruits = ss.getMapper(FruitMapper.class).getAllFruit();
		Fruits fruitss = new Fruits(fruits);
		return fruitss;
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
