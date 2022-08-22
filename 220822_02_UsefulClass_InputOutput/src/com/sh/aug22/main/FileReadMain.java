package com.sh.aug22.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows�� ��ο� ��ҹ��� ���� x
		// Linux�� ��ҹ��� ���� O
		
		// FileReader ���� BufferedReader�� �� ����
		// �����Ȱ͵� �� �ϳ��� ������ �������� �ڵ����� ó��
		BufferedReader br = null;
		try {
			// ���� -> ���α׷� (InputStreamReader ����(2byte))
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
