package com.sh.aug22.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.io.UnsupportedEncodingException;

public class EncodingMain {

	// Encoding : 정보의 형태나 형식을 변환하는 처리방식
	// 컴퓨터 : 전자기계 (전기가 흐르거나 / 흐르지 않거나)
	// 'ㅋ' -> 전기의 흐름으로 표현 (모르스부호 같은 느낌) -> Encoding
	
	// Decoding : 인코딩 된 데이터의 통신 전송 및 파일을 원래의 상태로 변환
	// 전기 신호 sth -> 'ㅋ' -> Decoding
	
	// Encoding 방식은 여러 종류가 있음
	//	  encoding  decoding
 	// 추석 -A-> 1010 -A-> 추석
	// 추석 -B-> 0101 -C-> 설날
	// 추석 -C-> 0001 -???-> ?!?!?!
	
	// 전 세계적으로 주력 인코더 : UTF-8 (Unicode Transform Format)
	// 한국인 타겟 : EUC-KR
	// MS전용 : MS949
	
	// 9호선 -UTF-8-> 1011 -MS949-> ???
	// 인코딩과 디코딩은 같은 종류로 진행해야 함
	
	
	public static void main(String[] args) {
//		FileOutputStream fos = null; //1byte stream 제작
//		try {
//			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\KDT\\Test\\test.txt", true);
//
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null; // 2byte stream 제작 후 1byte를 덮어씌움
//		try {
//			osw = new OutputStreamWriter(fos, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		BufferedWriter bw = new BufferedWriter(osw);
//		try {
//			bw.write("anything");
//			bw.append("\r\n");
//			bw.append("sth");
//			bw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\KDT\\Test\\test.txt");
			
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			br = new BufferedReader(isr);
			
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
