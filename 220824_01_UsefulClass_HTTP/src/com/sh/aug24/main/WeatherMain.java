package com.sh.aug24.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sh.aug23.client.WHHttpClient;

// AJAX - JavaScript에서 XML 파싱
//	-> XML은 이용율이 저하중
//	-> JavaScript에 친화된 형태 서칭

// JSON (JavaScript Object Notation)
//		DB에 있는 데이터를 JavaScript형태로 표현한 것
//		XML보다도 월등히 좋음

// Java 배열 : { 1, 2, 3 }
// JavaScript 배열 : [ 1, 2, 3 ]

// Java 객체 : Dog d = new Dog();
//				d.getName("왈왈이");
//				d.getAge(3);

//JS 객체 : { name : "왈왈이", age : 3 }

public class WeatherMain {
	public static void main(String[] args) {
//		 api.openweathermap.org/data/2.5/forecast?
//		 q=seongnam&appid=5e6d6e938c64cabcecd3e680a2352ee1
//		 &units=metric&lang=kr
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("City : ");
			String cityName = k.next();
			
			cityName = URLEncoder.encode(cityName, "UTF-8");
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address	+= "?q=" + cityName;							// 도시이름 입력
			address += "&appid=5e6d6e938c64cabcecd3e680a2352ee1";	// API키 	입력
			address += "&units=metric";								// 섭씨온도 출력
			address	+= "&lang=kr";									// 한국어로 출력
//			System.out.println(address);
			
			InputStream is = WHHttpClient.download(address);
			String str = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
			JSONParser jp = new JSONParser(); //json 파싱 -> 객체 하나 필요
			
			// [] : 배열
//			JSONArray ja = (JSONArray) jp.parse(str);
//			System.out.println(ja);
			
			// {} : 객체
			JSONObject jo = (JSONObject) jp.parse(str);
			System.out.println(jo);
			
			// 나라 이름
			JSONObject sys = (JSONObject) jo.get("sys");
			String country = (String) sys.get("country");
			System.out.println(country);
			
			// 도시 이름
			String cityName2 = (String) jo.get("name");
			System.out.println(cityName2);
			
			// 날씨 설명
			JSONArray ja2 = (JSONArray) jo.get("weather");
			JSONObject jo2 = (JSONObject) ja2.get(0);
			String description = (String) jo2.get("description");
			System.out.println(description);
			
			// 기온
			JSONObject main = (JSONObject) jo.get("main");
			double temp = (double) main.get("temp");
			System.out.println(temp);
			// 체감온도
			double feelsLike = (double) main.get("feels_like");
			System.out.println(feelsLike);
			// 최저기온
			double tempMin = (double) main.get("temp_min");
			System.out.println(tempMin);
			// 최고기온
			double tempMax = (double) main.get("temp_max");
			System.out.println(tempMax);
			// 기압
			long pressure = (long) main.get("pressure");
			System.out.println(pressure);
			// 습도
			long humidity = (long) main.get("humidity");
			System.out.println(humidity);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
























































}
