package com.sh.aug18.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sh.aug18.frame.TempFrame;

// 화씨온도 -> 섭씨온도 변환기
public class Aug_18_Main3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel pl = new JPanel();
		jf.add(pl);
		
		JLabel label1 = new JLabel("화씨온도 : "); // 문자 출력
		JLabel label2 = new JLabel("섭씨온도 : "); // 문자 출력
		JTextField field1 = new JTextField(15); // 텍스트 입력 공간 크기
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환"); //버튼 생성
		
		pl.add(label1); // 패널에 추가
		pl.add(field1);
		pl.add(label2);
		pl.add(field2);
		pl.add(button);
		
		TempFrame tFram = new TempFrame(pl, label1, label2, field1, field2, button);
		button.addActionListener(tFram); // 버튼을 눌렀을 때 기능이 작동하도록
		
		
		jf.setSize(300, 150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임 종료 후 프로그램 종료
		jf.setTitle("온도 변환기");
		jf.setVisible(true);
		
	}
}
