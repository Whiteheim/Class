package com.sh.sep29;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.AbstractApplicationEventMulticaster;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	// Spring : Java에서 IoC(흐름을 돌림)로 DI(의존성 주입)해주는 Framework
	// 		Java에서는 객체를 .java에서 만듦
	//		Spring에서는 객체를 ┏외부파일(.xml)에 만듦 -> .java에서 불러서 사용케 함┙
	//											(의존성 주입)
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		// 이 때 까지의 객체 생성 방식
		//Dog d = new Dog("개", 3);
		//System.out.println(d.getName());
		//System.out.println(d.getAge());
		
		// sep29beans.xml 불러오기 -> xml파일에 등록해놓은 객체 만들어서 Java안에서 사용
		// AbstractApplicationContext : Bean 객체를 생성하고 관리하는 기능 
		AbstractApplicationContext aac = 
				new ClassPathXmlApplicationContext("sep29beans.xml");
		
		
		
		// aac가 없어질 때 등록해놓은 객체들 모두 삭제
		aac.registerShutdownHook();

		// id가 d 인 강아지 객체 불러오기
		Dog d = aac.getBean("d", Dog.class);	// xml 객체 불러오기
		System.out.println(d);
		System.out.println("------------------");
		
		// DI (Dependency Injection - 의존성 주입)
		//		xml에서 객체를 만들고, 속성값 입력하고
		//		java에서 가져다 쓰는 과정
		Dog d2 = aac.getBean("d2", Dog.class);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println("------------------");
		
		Dog d3 = aac.getBean("d3", Dog.class);
		System.out.println(d3.getName());
		System.out.println(d3.getAge());
		System.out.println("------------------");
		
		// 책 객체 만들어 이름-가격 출력
		
		Book b = aac.getBean("b", Book.class);
		System.out.println(b);
		System.out.println("------------------");
		
		Book b2 = aac.getBean("b2", Book.class);
		System.out.println(b2.getTitle());
		System.out.println(b2.getPrice());
		System.out.println("------------------");
		
		Book b3 = aac.getBean("b3", Book.class);
		System.out.println(b3.getTitle());
		System.out.println(b3.getPrice());
		System.out.println("------------------");
		
		
		
		
		
		
		
		
		
		
		
		//aac 없애기
		aac.close();
		
		return "home";
	}
	
}





















































