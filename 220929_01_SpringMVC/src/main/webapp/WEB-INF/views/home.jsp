<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	Before Spring
	Application 구현 -> EJB (Enterprise JavaBeans)사용 (매우 복잡)
	EJB의 기술이 점점 발전하면서 프로그램이 무거워 지고 성능 속도가 저하됨
	기능을 추가할 수 록 계속 복잡해짐
	개발자들은 이 EJB사용 시절을 '겨울'에 빗대어 표현
	'겨울'이 끝나고 '봄'이 찾아왔다 해서 Spring이라 이름 짓게됨
	
	Spring의 등장 : 
		Java의 문법을 사용해서 기능 구현
		- Java의 문법을 사용하기 때문에 간단해서 진입장벽이 낮음 (홈페이지 설명 중)
		POJO - Plan Old Java Object : Java의 기본으로 돌아가자
		(객체지향을 기초로 한 설계)
	
	Spring Framework
		Spring 없이도 웹 구현이 가능
		기능 구현에만 집중해서 빠르게 개발 가능하도록 
		Framework가 기본적으로 필요한 '뼈대'를 제공
			vs
				Library
					프로그램을 제작 할 때 필요한 기능
					개발자가 사용을 원할때 찾아서 사용가능
					(ex: jason-simple.jar, cos.jar, ...)
		Framework : 개발자가 도구를 이용 가능하도록 만들어 둔 틀
		Library : 사용자가 필요할 때 직접 호출해서 쓸 수 있는 도구 		
	
	Spring의 구조
	- Java Resources
		자바의 영역 (src/main/java)		: Java코드 작성
		자원의 영역 (src/main/resources): MyBatis(XML) 파일, DB(SQL) 파일, ...
	
	- src - main - webapp - WEB-INF 폴더							: 웹을 중요한 파일들이 노출되지 않도록 만든 폴더
																	cf) META-INF 폴더는 Java에서 설정관련 파일을 저장하는 폴더
	
						  - WEB-INF - spring - root-context.xml		: 워크스페이스 전체에 대한 설정
						  				     	
					  					     - servlet-context.xml 	: 현재 프로젝트에 대한 설정
										   
								    - views 						: 사용자가 볼 수 있게 View를 작성하는 공간 (.jsp, .html)
								  
								  		     - web.xml				: 프로그램 실행시 함께 따라가는 설정들을 모아둔 파일
								  		   								Client의 요청을 처리하는 [DispatcherServlet]
								  		   								Web Application 단위 설정을 불러오는 [ContextLoaderListener]
								  		   								Client의 요청을 DispatcherServlet으로 가기 전에 거치는 부분 [Filter]
								  		   								
						  - target - pom.xml					 	: 필요한 라이브러리들을 maven의 중앙 저장소에서 가져와서 관리해주는 파일
			  
			  
</body>
</html>














































