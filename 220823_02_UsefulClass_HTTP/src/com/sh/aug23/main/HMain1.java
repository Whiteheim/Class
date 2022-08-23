package com.sh.aug23.main;

import java.io.IOException;
import java.io.InputStream;

import com.sh.aug23.client.WHHttpClient;

public class HMain1 {
	// ���ϴ� ����Ʈ ������ �ܼ�â�� ����ϱ�
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = WHHttpClient.download("https://www.youtube.com");
			String result = WHHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
