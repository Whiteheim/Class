package com.sh.aug23.client;

import java.io.InputStream;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = WHHttpClient.download("https://www.naver.com");
			
			String result = WHHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
