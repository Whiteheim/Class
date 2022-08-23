package com.sh.aug23.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신 
//		HTTP통신 - 클라이언트가 요청을 하면 서버가 그 요청에 맞게 응답
//		Socket통신 - 실시간 통신 (강제 전송 가능)

// Java에는 HTTP통신을 위한 HTTPClient 기능 X 
// 추후 한 개발자가 개발하여 공개

// apache.org - downloads - releases - httpcomponents 검색 - 4.5.13
// 		- httpclient/ - binary/ - httpcomponents-client-4.5.13-bin.zip 다운로드 

public class HMain1 {
	public static void main(String[] args) {
		// 서버 접속
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// 요청 - GET(기본) or POST 방식
			HttpGet hg = new HttpGet("https://www.naver.com/");
			
			// 응답 
			HttpResponse hr = dhc.execute(hg);
			
			// 응답 내용
			HttpEntity he = hr.getEntity();
			
			// 응답 내용을 가져갈 수 있는 Stream
			InputStream is = he.getContent();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


























