package com.sh.aug23.main;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

//http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500

// hour		: �ð�
// temp		: �µ�
// wfkor	: ����
// wdkor	: �ٶ�
// �ֿܼ� ���
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
						System.out.printf("�ð� : %s��\n", xpp.getText());
					}
					else if (tagName.equals("temp")) {
						System.out.printf("�µ� : %s��\n", xpp.getText());
					}
					else if (tagName.equals("wfKor")) {
						System.out.printf("���� : %s\n", xpp.getText());
					}
					else if (tagName.equals("wdKor")) {
						System.out.printf("ǳ�� : %s��\n", xpp.getText());
					}
					else if (tagName.equals("sky")) {
						if (xpp.getText() == "1") {
							System.out.println("���� : ����");
						} else if (xpp.getText() == "3") {
							System.out.println("���� : ���� ����");
						} else if (xpp.getText() == "4") {
							System.out.println("���� : �帲");
							
						}
					}
					else if (tagName.equals("pty")) {
						System.out.printf("�������� : %s\n", xpp.getText());
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
