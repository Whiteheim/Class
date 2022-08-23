package com.sh.aug23.main;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

//http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500

// hour		: 시간
// temp		: 온도
// wfkor	: 날씨
// wdkor	: 바람
// 콘솔에 출력
public class WeatherMain {
	public static void main(String[] args) {
		String address = "http://www.kma.go.kr"
				+ "/wid"
				+ "/queryDFSRSS.jsp?zone=4113554500";
		
		try {
			InputStream is = WHHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.printf("시간 : %s시\n", xpp.getText());
					}
					else if (tagName.equals("temp")) {
						System.out.printf("온도 : %s℃\n", xpp.getText());
					}
					else if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s\n", xpp.getText());
					}
					else if (tagName.equals("wdKor")) {
						System.out.printf("풍향 : %s쪽\n", xpp.getText());
					}
					else if (tagName.equals("sky")) {
						if (xpp.getText() == "1") {
							System.out.println("날씨 : 맑음");
						} else if (xpp.getText() == "3") {
							System.out.println("날씨 : 구름 많음");
						} else if (xpp.getText() == "4") {
							System.out.println("날씨 : 흐림");
							
						}
					}
					else if (tagName.equals("pty")) {
						System.out.printf("강수상태 : %s\n", xpp.getText());
						System.out.println("==================");
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
