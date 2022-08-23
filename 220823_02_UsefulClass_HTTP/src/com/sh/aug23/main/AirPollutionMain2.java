package com.sh.aug23.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

// �̼����� -> �Ľ� -> ������ -> txt���Ͽ� ���
// ��¥, ������, �̼�����, �ʹ̼�����, ����, ���մ��ȯ������
// ��¥ : ��-��-��-����/����-�� ����
// ���� x 
public class AirPollutionMain2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\KDT\\http\\air.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh-E");
			String nowStr = sdf.format(now);
			
			String address = "http://openAPI.seoul.go.kr:8088"
					+ "/4f626857416f6c6c3632586a416843"
					+ "/xml"
					+ "/RealtimeCityAir"
					+ "/1"
					+ "/25"
					+ "/";
			
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
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("O3")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("IDEX_MVL")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
