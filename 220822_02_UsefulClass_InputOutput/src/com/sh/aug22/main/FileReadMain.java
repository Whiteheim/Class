package com.sh.aug22.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows는 경로에 대소문자 구분 x
		// Linux는 대소문자 구분 O
		
		// FileReader 위에 BufferedReader를 덧 씌움
		// 연관된것들 중 하나만 닫으면 나머지는 자동으로 처리
		BufferedReader br = null;
		try {
			// 파일 -> 프로그램 (InputStreamReader 개조(2byte))
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\KDT\\Test\\test2.txt");
			br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
