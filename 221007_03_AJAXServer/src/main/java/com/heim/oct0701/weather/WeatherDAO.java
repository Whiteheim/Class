package com.heim.oct0701.weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class WeatherDAO {
	
	// 기상청 XML 다운 -> String 한 덩어리로 뭉쳐서 그대로 리턴
	// https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500
	public String getKoreaWeather(HttpServletRequest req) {
		try {
			URL u = new URL("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500");
			
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			// 나오는 데이터 하나하나를 덩어리로 모으기
			
			StringBuffer sb = new StringBuffer();
			
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line.replace("\r\n", ""));
			}
			
			// 다운 받아온 데이터를 한 곳에 모으기 or 엔터 처리 삭제
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}































