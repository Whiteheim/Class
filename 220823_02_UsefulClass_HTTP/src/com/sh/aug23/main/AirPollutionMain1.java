package com.sh.aug23.main;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.sh.aug23.client.WHHttpClient;

// ������ (Ŭ���̾�Ʈ�� ������Ʈ�� ��û -> ����Ʈ�� ����)
// �ǽð� �����͸� XML Parsing (Ŭ���̾�Ʈ�� �����͸� ��û -> XML / JSON ����)
// �� �����͸� ������ ������ �̹���ȭ�� ���� ���� ����
//		data.go.kr
//		data.seoul.go.kr
//		dev.naver.com
//		dev.kako.com
//		...etc

// ���� ���������� ���� DB - �̼����� ������

// DB�� �ִ� �����͸� ����鿡�� ������� �ϴ� ���
//		��κ��� ������� SQL��� ����
//		������Ʈ ���� : �Ϲ��ε��� DB�� ������ �����ϰ� ����

//		�����ڰ� �����͸� �������� ���� �� 
//		�����͸� Ư���� �������� ǥ�������
//		DB�� �ִ� �����͸� ǥ���ϴ� ���� : XML, JSON

// Parsing - kxml2.jar (�ȵ���̵� ���� ���� ���α׷���  ����Ǿ�����)
//	�����͸� �з��Ͽ� ���ϴ� ���·� �����ϴ� �۾�

// XML (eXtensible Mark-up Language)
//		DB�� �ִ� �����͸� HTML���·� ǥ���� ��
//		<xxx> 	: �����±� (xxx : �±׸�)		
//			yyy	: �ؽ�Ʈ
//		<\xxx>	: �����±�

// START_DOCUMENT	: ������ ����
// END_DOCUMENT		:  ������ ��
// START_TAG		: �����±� (<xxx>)
// END_TAG			: �����±� (\xxx)
// TXT				: �ؽ�Ʈ (�����±׿� �����±� ������ ����)

//http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/

// mvnrepository - �����ڵ� ���� ��αװ�����
public class AirPollutionMain1 {
	public static void main(String[] args) {
		try {
			String address = "http://openAPI.seoul.go.kr:8088" // �ּ�
					+ "/4f626857416f6c6c3632586a416843" // ����Ű
					+ "/xml" // �������� ����������
					+ "/RealtimeCityAir" + "/1" + "/25" + "/";
			InputStream is = WHHttpClient.download(address);
//			String result = WHHttpClient.convert(is, "UTF-8");
//			System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType(); // tag���� ������ȣ �����Ǿ�����. ������� ����
			String tagName = null; // tag�� �̸�
			while (type != XmlPullParser.END_DOCUMENT) { // ������ ������ �� ���� �ݺ��� ����
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						System.out.printf("���� �� : %s\n", xpp.getText());
					} else if (tagName.equals("PM10")) {
						System.out.printf("�̼����� : %s��/��\n", xpp.getText());
					} else if (tagName.equals("PM25")) {
						System.out.printf("�ʹ̼����� : %s��/��\n", xpp.getText());
					} else if (tagName.equals("O3")) {
						System.out.printf("���� : %sppm\n", xpp.getText());
					} else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("���մ��ȯ������ : %s\n", xpp.getText());
						System.out.println("--------------------------");
					}

				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML������ ���⸦ �ؽ�Ʈ�� �ν��ϴ� ��찡 �־� ������ �߻��� �� ����
				}
				xpp.next(); // �������� �Ѿ
				type = xpp.getEventType(); // ���� �±��� ���� ����
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
