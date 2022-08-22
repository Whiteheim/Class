package com.sh.aug22.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CPU		: ������ġ
// RAM		: ������ġ(������ �ӽ÷� ����) - ����� �� ���嵥���� �Ҹ�
// 				static / stack - ���α׷��� �����ϸ� ������ �Ҹ�
//				heap - GC(Garbage Collection)�� ������ ���� �� ������ �Ҹ�, ������ ������ ����
// HDD(SSD)	: ������ġ (������) - ���Ͽ� ����
// GPU		: �׷��� ó����( CPU + RAM + HDD )

// ���α׷������� �����͸� �ܺο��� �а�, �ٽ� �ܺη� ����ϴ� �۾��� ���� �߻�
// ������ - ����ڷκ��� �Է� ���� ex)Ű����		(Scanner)
// 			File.Network�� ���ؼ��� �Է� ����		(Input)

// 			����͸� ���� ��� ���� 				(System.out.println)
// 			File.Network�� ���ؼ��� ��� ���� 		(Output)


// System.in 	-> InputStream
// System.out 	-> PrintStream

//  'Stream' - ���α׷��� ��/�����ġ�� �����Ͱ� �̵��ϴ� ���
// 			   ���α׷� -> ��/�����ġ : Output
//			   ��/�����ġ -> ���α׷� : Input

// 	Stream : 
//		�⺻��
//			InputStream : ��ġ�� (Ű����, ����, ��Ʈ��ũ, ...) �̿��� ���α׷����� �Է� (1byte��)
//			InputStreamReader : ��ġ�� �̿��� ���α׷����� �Է� (2byte��)
//			BufferedReader : 1String - line�� �Է� 

//			OutputStream : ���α׷��� ����� ��ġ��(Ű����, ����, ��Ʈ��ũ, ...) ��� (1byte��)
//			OutputStreamWriter : 2byte�� ���
//			BufferedWriter : 1String - line�� ���

//		������ (Ư�������� ���� ����) :
//			PrintStream (OutputStream ����) - �Է��ϱ� ���ϰ� ������ method�� �߰� (syso)
//			FileReader (InputStreamReader ����) - ���Ͽ��� �����͸� �о���� ���ϰ� ����
//			FileWriter (OutputStreamWriter ����) - �����͸� ����ϱ� ���ϵ��� ����

public class FileWriteMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		// System.in : �ܼ�â -> ���α׷� (InputStream)
		// JDK 1.5ver ���� Scanner �߰�
		// InputStream�� ����ϱ� ���ϰ� ����
		System.out.print("�Է� : ");
		String cmt = k.next();
		
		System.out.println("---------");
		//System.out : ���α׷� -> �ܼ�â (PrintStream)
		
		// FileWriter
		//		���α׷� -> ���� (OutputStreamWriter�� ������)
		// 		������ ������ ����� �ֱ⵵ ��
		//		���������� �Ұ�
		//		Linux�� ��� : C:/Users/user/Desktop/KDT/Test/test.txt -> '\'�� '/'�� �ٲ� ����
		//		Windows�� ��� : C:\\Users\\user\\Desktop\\KDT\\Test\\test.txt -> '\\' ��� 
		//																		  '/'�� ��뵵 ����
		//		Java�� \ : \t, \r, \n, \0, ... �� ��� (�̽������� ����)
		//		����, ������ ��Ÿ, ... -> ����ó��
		
		// fw ���� bw�� ������ ����
		// ������ �͵� �߿��� �ϳ��� ������ �� ó����
		BufferedWriter bw = null;
		try {
			//  ������ ������ �̹� �����ϰ� ������ ����۽� ������ ���
			//	������ �ִ� ������ ������ ������Ե�
			//	������ ����ڿ� �����̰� ������ (�����͸� �߰��ϰ� �ʹٸ�)
			//	�ι�° �Ķ���� ������ true�� �ָ� ��
			
			// Encoding ��� ���� x -> ANSI�� ���ڵ��� 
			FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\KDT\\Test\\test2.txt", true);
			
			// 1byte �� ����� x
			//	Buffer�� �̿��� �ѹ��� ���� �뷮�� ������ϴ� ���� ����
			//		=> ��κ��� ����� �۾����� ���
			//	Buffer : CPU�� HDD ���̿��� ���Ǵ� �ӽ� �������
			// 			 ������ ���� ���� CPU�� ����
			//	Buffering : Data�� buffer�� �����ϴ� ����
			//			-> ���༺�� ��� ����
			
			
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("-------------");
			bw.flush(); // Buffer�� �뷮�� max�� �ƴϾ ���������� CPU������ �����͸� ������
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
