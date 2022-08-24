package com.sh.aug24.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

// ID : FB78_6Ve0CdlU4I_Kom8
// Secret : 90eiD75yl4

// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%ED%83%9C%ED%92%8D

// ���ͳ� �ּ� ü��
// 	��������://	- ��� ���			http://
//		��ǻ���� �ּ�/ 				search.naver.com/
//		������/������/.../���ϸ�	search.naver
//		������=��&������=��&.. 		?(��û�Ķ���Ϳ� ��ǻ�� �ּҰ��� ����) where=nexearch&
//			=> ��û �Ķ���� : Ŭ���̾�Ʈ�� �������� ���������� ������ ����

// ���ͳ� �ּ�ü�迡�� �ѱ�, Ư�����ڰ� �ٷ� �� �� ����.
//		ex) �� -> %2D (URL ���ڵ�)
public class NaverNewsMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("�˻��� : ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);

			String address = "https://openapi.naver.com/v1/search/news.xml"; // ��û URL
			address += "?query=" + search; // ��û������ query�� �ʼ���� ��� (��û������ �� ������)

			// ������ title / description
			// ���� : Naver Open API - ???
			// ���� : Naver Search Result
			// => ������ �ʵ���

//			InputStream is = WHHttpClient.download(address); // ID�� Secret�� ���� ��� �Ұ�
//			String result = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
//			-----------------------------------------------------------------------------------
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			//��û ���
//			huc.addRequestProperty("X-Naver-Client-Id", "FB78_6Ve0CdlU4I_Kom8");
//			huc.addRequestProperty("X-Naver-Client-Secret", "90eiD75yl4");
//		
//			InputStream is = huc.getInputStream();
//			
//			String result = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
//			------------------------------------------------------------------------------------
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "FB78_6Ve0CdlU4I_Kom8");
			headers.put("X-Naver-Client-Secret", "90eiD75yl4");
			InputStream is = WHHttpClient.download(address, headers);
			// String result = WHHttpClient.convert(is, "UTF-8");
			// System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;
			String t = null;
			boolean data = false;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				} else if (type == XmlPullParser.TEXT) {
					if (data) {

						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot", "");
							t = t.replace("&apos", "");
							t = t.replace("&amp", "&");
							System.out.printf("���� : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot", "");
							t = t.replace("&apos", "");
							t = t.replace("&amp", "&");
							System.out.printf("���� : %s\n", t);
							System.out.println("----------------------------");
						}
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
