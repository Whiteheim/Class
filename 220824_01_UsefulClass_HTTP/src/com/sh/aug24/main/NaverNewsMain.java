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

// 인터넷 주소 체계
// 	프로토콜://	- 통신 방식			http://
//		컴퓨터의 주소/ 				search.naver.com/
//		폴더명/폴더명/.../파일명	search.naver
//		변수명=값&변수명=값&.. 		?(요청파라미터와 컴퓨터 주소값을 구분) where=nexearch&
//			=> 요청 파라미터 : 클라이언트가 서버에게 공개적으로 전달할 정보

// 인터넷 주소체계에는 한글, 특수문자가 바로 들어갈 수 없음.
//		ex) ㅋ -> %2D (URL 인코딩)
public class NaverNewsMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 : ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);

			String address = "https://openapi.naver.com/v1/search/news.xml"; // 요청 URL
			address += "?query=" + search; // 요청변수에 query는 필수라고 명시 (요청변수를 잘 봐야함)

			// 뉴스의 title / description
			// 제목 : Naver Open API - ???
			// 내용 : Naver Search Result
			// => 나오지 않도록

//			InputStream is = WHHttpClient.download(address); // ID와 Secret이 없어 사용 불가
//			String result = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
//			-----------------------------------------------------------------------------------
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			//요청 헤더
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
							System.out.printf("제목 : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot", "");
							t = t.replace("&apos", "");
							t = t.replace("&amp", "&");
							System.out.printf("내용 : %s\n", t);
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
