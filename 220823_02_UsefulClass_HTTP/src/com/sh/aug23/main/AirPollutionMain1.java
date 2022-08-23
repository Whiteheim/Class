package com.sh.aug23.main;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

// 웹서버 (클라이언트가 웹사이트에 요청 -> 사이트가 응답)
// 실시간 데이터를 XML Parsing (클라이언트가 데이터를 요청 -> XML / JSON 응답)
// 그 데이터를 가지고 웹으로 이미지화를 시켜 구현 가능
//		data.go.kr
//		data.seoul.go.kr
//		dev.naver.com
//		dev.kako.com
//		...etc

// 서울 열린데이터 광장 DB - 미세먼지 데이터

// DB에 있는 데이터를 사람들에게 보여줘야 하는 경우
//		대부분의 사람들이 SQL사용 못함
//		웹사이트 제작 : 일반인들이 DB에 접근을 용이하게 해줌

//		개발자가 데이터만 가져오고 싶을 때 
//		데이터를 특정한 형식으로 표현해줘야
//		DB에 있는 데이터를 표현하는 형식 : XML, JSON

// Parsing - kxml2.jar (안드로이드 어플 제작 프로그램은  내장되어있음)
//	데이터를 분류하여 원하는 형태로 가공하는 작업

// XML (eXtensible Mark-up Language)
//		DB에 있는 데이터를 HTML형태로 표현한 것
//		<xxx> 	: 시작태그 (xxx : 태그명)		
//			yyy	: 텍스트
//		<\xxx>	: 종료태그

// START_DOCUMENT	: 문서의 시작
// END_DOCUMENT		:  문서의 끝
// START_TAG		: 시작태그 (<xxx>)
// END_TAG			: 종료태그 (\xxx)
// TXT				: 텍스트 (시작태그와 종료태그 사이의 내용)

//http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/

// mvnrepository - 개발자들 전용 블로그같은거
public class AirPollutionMain1 {
	public static void main(String[] args) {
		try {
			String address = "http://openAPI.seoul.go.kr:8088" // 주소
					+ "/4f626857416f6c6c3632586a416843" // 인증키
					+ "/xml" // 서버내의 폴더같은것
					+ "/RealtimeCityAir" + "/1" + "/25" + "/";
			InputStream is = WHHttpClient.download(address);
//			String result = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType(); // tag마다 고유번호 지정되어있음. 순서대로 조우
			String tagName = null; // tag의 이름
			while (type != XmlPullParser.END_DOCUMENT) { // 문서가 끝나기 전 까지 반복문 실행
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						System.out.printf("측정 구 : %s\n", xpp.getText());
					} else if (tagName.equals("PM10")) {
						System.out.printf("미세먼지 : %s㎍/㎥\n", xpp.getText());
					} else if (tagName.equals("PM25")) {
						System.out.printf("초미세먼지 : %s㎍/㎥\n", xpp.getText());
					} else if (tagName.equals("O3")) {
						System.out.printf("오존 : %sppm\n", xpp.getText());
					} else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("통합대기환경지수 : %s\n", xpp.getText());
						System.out.println("--------------------------");
					}

				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있어 오류가 발생할 수 있음
				}
				xpp.next(); // 다음으로 넘어감
				type = xpp.getEventType(); // 다음 태그의 값을 가짐
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
