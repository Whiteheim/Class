// Java GUI프로그램 (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : 자바 초창기에 나온 GUI의 라이브러리
// 		운영체제(OS)에 따라서 모양이 달랐기 대문에, 종류도 상당히 제한적이었다.
// Swing : AWT 다음으로 나온 라이브러리 
//		 윈도우 프로그램 - 자바로 만들지 않음 : 느림, 더 최적화 된 C언어 라인이 있기때문
//		 윈도우 프로그램은 잘 안만듬 : 웹/앱쪽으로 넘어가는 추세이기 때문
//		 - 디자인도 별로, 효용성도 별로임
// 		 - Android App 구조를 이해하는데 도움이 됨
// Java FX : Swing의 느린 처리속도를 개선하여 출시
//			다양한 기능들도 추가 + 따로 외관을 꾸미는 것도 가능해짐
// 			여전히 웹/앱쪽에서 구현하면 되기 때문에 잘 사용되지않음

package com.sh.aug18.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sh.aug18.hero.Hulk;

public class Aug_18_Main2 {
	public static void main(String[] args) {
	// Swing , AWT로 표현	
	JFrame jf = new JFrame("지구");
	JButton jb = new JButton("김초보");
	jf.add(jb);
	
	// Hulk - actionPerformed()가 반드시 필요
	//			미완성 메소드
	
	// Hulk 생성
	Hulk h = new Hulk();
	
	// 캐릭터가 전담영웅으로 선택
	jb.addActionListener(h);
	
	// 행성의 크기, 눈에 보이도록, 
	jf.setSize(500, 500);
	jf.setVisible(true);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
