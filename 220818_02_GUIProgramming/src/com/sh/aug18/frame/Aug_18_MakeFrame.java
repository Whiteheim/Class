package com.sh.aug18.frame;


import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame(메인 프레임 역할) : Swing에서 윈도우를 나타내는 Class
//		JPanel(보조 프레임 역할), JBotton(버튼의 기능), JLabel(라벨), JTextField(글자 입력), ...etc
// layout : flowLayout - 가운데 정렬
// 			BorderLayout - Frame의 형식 지정
//			GridLayout - 격자 형태
//			setLocation, setBounds - 위치 임의 지정



 public class Aug_18_MakeFrame extends JFrame{
	JPanel pl;
	
	public Aug_18_MakeFrame() {
		setSize(500, 500);		// 프레임의 사이즈
		setTitle("GUI 연습");	// 프레임의 제목
		pl = new JPanel();		// 보조 프레임 (패널 하나 생성)
		pl.setLayout(new FlowLayout()); // 가운데 정렬
		for (int i = 1; i <= 10 ; i++) {
			pl.add(new JButton("버튼" +  i));	// pl안에 button을 넣어둔 상태
		}
		add(pl); // JPanel을 JFrame안에 넣기
		setVisible(true); // JFrame 보이게 하는 기능
		
		
		
		
		
		
	}

	
	
}
