package com.sh.aug22.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CPU		: 연산장치
// RAM		: 저장장치(변수를 임시로 저장) - 재부팅 시 저장데이터 소멸
// 				static / stack - 프로그램을 종료하면 데이터 소멸
//				heap - GC(Garbage Collection)가 있으면 종료 시 데이터 소멸, 없으면 데이터 유지
// HDD(SSD)	: 저장장치 (영구적) - 파일에 저장
// GPU		: 그래픽 처리용( CPU + RAM + HDD )

// 프로그램에서는 데이터를 외부에서 읽고, 다시 외부로 출력하는 작업이 자주 발생
// 데이터 - 사용자로부터 입력 가능 ex)키보드		(Scanner)
// 			File.Network를 통해서도 입력 가능		(Input)

// 			모니터를 통해 출력 가능 				(System.out.println)
// 			File.Network를 통해서도 출력 가능 		(Output)


// System.in 	-> InputStream
// System.out 	-> PrintStream

//  'Stream' - 프로그램과 입/출력장치에 데이터가 이동하는 통로
// 			   프로그램 -> 입/출력장치 : Output
//			   입/출력장치 -> 프로그램 : Input

// 	Stream : 
//		기본형
//			InputStream : 장치를 (키보드, 파일, 네트워크, ...) 이용해 프로그램으로 입력 (1byte씩)
//			InputStreamReader : 장치를 이용해 프로그램으로 입력 (2byte씩)
//			BufferedReader : 1String - line씩 입력 

//			OutputStream : 프로그램의 결과를 장치로(키보드, 파일, 네트워크, ...) 출력 (1byte씩)
//			OutputStreamWriter : 2byte씩 출력
//			BufferedWriter : 1String - line씩 출력

//		개조형 (특수목적에 따라 개조) :
//			PrintStream (OutputStream 개조) - 입력하기 편하게 유용한 method들 추가 (syso)
//			FileReader (InputStreamReader 개조) - 파일에서 데이터를 읽어오기 편하게 개조
//			FileWriter (OutputStreamWriter 개조) - 데이터를 출력하기 편하도록 개조

public class FileWriteMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		// System.in : 콘솔창 -> 프로그램 (InputStream)
		// JDK 1.5ver 부터 Scanner 추가
		// InputStream을 사용하기 편하게 지원
		System.out.print("입력 : ");
		String cmt = k.next();
		
		System.out.println("---------");
		//System.out : 프로그램 -> 콘솔창 (PrintStream)
		
		// FileWriter
		//		프로그램 -> 파일 (OutputStreamWriter의 개조형)
		// 		파일이 없으면 만들어 주기도 함
		//		폴더생성은 불가
		//		Linux의 경로 : C:/Users/user/Desktop/KDT/Test/test.txt -> '\'를 '/'로 바꿔 설정
		//		Windows의 경로 : C:\\Users\\user\\Desktop\\KDT\\Test\\test.txt -> '\\' 사용 
		//																		  '/'로 사용도 가능
		//		Java의 \ : \t, \r, \n, \0, ... 에 사용 (이스케이프 문자)
		//		권한, 폴더명 오타, ... -> 예외처리
		
		// fw 위에 bw를 덧씌운 상태
		// 연관된 것들 중에서 하나만 닫으면 다 처리됨
		BufferedWriter bw = null;
		try {
			//  지정된 파일이 이미 존재하고 있으면 재시작시 내용을 덮어씀
			//	기존에 있던 파일의 내용은 사라지게됨
			//	기존의 내용뒤에 덧붙이고 싶으면 (데이터를 추가하고 싶다면)
			//	두번째 파라미터 값으로 true를 주면 됨
			
			// Encoding 방식 지정 x -> ANSI로 인코딩됨 
			FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\KDT\\Test\\test2.txt", true);
			
			// 1byte 씩 입출력 x
			//	Buffer를 이용해 한번에 여러 용량을 입출력하는 것이 빠름
			//		=> 대부분의 입출력 작업에서 사용
			//	Buffer : CPU와 HDD 사이에서 사용되는 임시 저장공간
			// 			 공간이 가득 차면 CPU로 보냄
			//	Buffering : Data를 buffer로 저장하는 동작
			//			-> 실행성능 향상 가능
			
			
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("-------------");
			bw.flush(); // Buffer의 용량이 max가 아니어도 강제적으로 CPU쪽으로 데이터를 내보냄
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
