package com.sh.aug23.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// ��� 
//		HTTP��� - Ŭ���̾�Ʈ�� ��û�� �ϸ� ������ �� ��û�� �°� ����
//		Socket��� - �ǽð� ��� (���� ���� ����)

// Java���� HTTP����� ���� HTTPClient ��� X 
// ���� �� �����ڰ� �����Ͽ� ����

// apache.org - downloads - releases - httpcomponents �˻� - 4.5.13
// 		- httpclient/ - binary/ - httpcomponents-client-4.5.13-bin.zip �ٿ�ε� 

public class HMain1 {
	public static void main(String[] args) {
		// ���� ����
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// ��û - GET(�⺻) or POST ���
			HttpGet hg = new HttpGet("https://www.naver.com/");
			
			// ���� 
			HttpResponse hr = dhc.execute(hg);
			
			// ���� ����
			HttpEntity he = hr.getEntity();
			
			// ���� ������ ������ �� �ִ� Stream
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

























