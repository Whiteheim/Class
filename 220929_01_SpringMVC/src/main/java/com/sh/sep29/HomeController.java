package com.sh.sep29;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	
	// @ : Annotation
	//		- 사전적 의미 = '주석'
	//		- 코드사이에 주석처럼 쓰이며 기능을 수행하도록 하는 기술
	//			코드 작성 문법 에러를 체크하도록 정보를 제공
	//			이 개발 툴이 코드를 자동으로 생성할 수 있도록 도와줌
	//			실행시 특정 기능을 수행하도록 도와줌
	
	// 종류 
	//		1. @Bean : 개발자가 직접 제어 불가능한 외부 Library등을 
	//				객체 Bean으로 만들 때 사용
	//		2. @Autowired : 속성, setter, 생성자에서 사용
	//				Type에 따라 Bean을 주입해주기도 함
	//		3. @Controller : Spring의 Controller 기능
	//				view(화면, .jsp)를 return 해줌
	//		4. @RestController : Controller 중에서 View쪽으로 응답하지 않는 Controller
	//				data(xml, json)들을 return 해줌
	//				Spring 4.x.x에서 부터 제공
	//		5. @ResponseBody : Java 객체를 HTTP 요청에 의해 body 내용으로 mapping해주는 역할
	//				RestController = Controller + ResponsBody
	//		6. @Service : 비즈니스 로직을 수행하는 Class를 나타냄
	//				비즈니스 로직 (Business Logic) : 사용자에게는 보이지 않지만 
	//					사용자가 원하는 결과물을 올바르게 도출할 수 있도록 자여진 코드 
	//		7. @XmlRootElement / @XmlElement :
	//				OXM(Object XML Mapping)을 하기 위해 사용
	//				OXM : 특정 데이터를 XML형식으로 변환 해주는 기능
	//						마샬링 (mashalling)
	//				XML데이터를 특정 데이터로 변환 해주는 기능
	//						언마샬링(unmashalling)
	//				XMLRootElement : Javabean 객체의 Class명 위에 명시
	//				XMLElement : Javabean 객체의 setter method에 명시
	//		8. @RequestMapping : @RequestMapping(value = "/", method = RequestMethod.GET)
	//				요청에 따라 요청을 처리 할 수 있는 Controller와 Method를 Mapping해주는 기능
	//				value : 요청받을 주소(url) 설정
	//				method : 어떤 요청으로 받을 지 설정
	//					(GET, POST, PUT, DELETE, FETCH, ...)
	//				W3C(표준 개발 기구, World Wide Web Consortium)에서
	//					PUT, DELETE, FETCH의 실용성에 의구심을 품음 => 후에 이용되지 않아짐
	//		9. @RequestParam : 요청 파라미터 설정가능
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
		// servlet-contxt.xml의 beans 문항
		// prefix = "/WEB-INF/views/"와 중간경로인 "home"과 subfix = ".jsp"가 합쳐져서
		// "/WEB-INF/views/home.jsp"라는 view파일 경로로 이동해서
		// Client에게 응답해주는 형태
		
	}
	
}




































