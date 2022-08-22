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

	// Encoding : ������ ���³� ������ ��ȯ�ϴ� ó�����
	// ��ǻ�� : ���ڱ�� (���Ⱑ �帣�ų� / �帣�� �ʰų�)
	// '��' -> ������ �帧���� ǥ�� (�𸣽���ȣ ���� ����) -> Encoding
	
	// Decoding : ���ڵ� �� �������� ��� ���� �� ������ ������ ���·� ��ȯ
	// ���� ��ȣ sth -> '��' -> Decoding
	
	// Encoding ����� ���� ������ ����
	//	  encoding  decoding
 	// �߼� -A-> 1010 -A-> �߼�
	// �߼� -B-> 0101 -C-> ����
	// �߼� -C-> 0001 -???-> ?!?!?!
	
	// �� ���������� �ַ� ���ڴ� : UTF-8 (Unicode Transform Format)
	// �ѱ��� Ÿ�� : EUC-KR
	// MS���� : MS949
	
	// 9ȣ�� -UTF-8-> 1011 -MS949-> ???
	// ���ڵ��� ���ڵ��� ���� ������ �����ؾ� ��
	
	
	public static void main(String[] args) {
//		FileOutputStream fos = null; //1byte stream ����
//		try {
//			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\KDT\\Test\\test.txt", true);
//
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null; // 2byte stream ���� �� 1byte�� �����
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
