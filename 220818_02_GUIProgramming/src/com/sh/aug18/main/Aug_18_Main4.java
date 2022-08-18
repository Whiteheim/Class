package com.sh.aug18.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sh.aug18.frame.BMIFrame;

public class Aug_18_Main4 {
	public static void main(String[] args) {
		// 제목이 BMI 검사인 JFram
		JFrame jf = new JFrame("BMI 검사");
		// 3행 2열 짜리 GridLayout
		GridLayout gl = new GridLayout(3, 2);
		// JFrame의 레이아웃 속성을 gl로 사용
		jf.setLayout(gl);
		
		JLabel label1 = new JLabel("신장(cm): "); 
		jf.add(label1);
		
		JTextField feild1 = new JTextField();
		jf.add(feild1);
		
		JLabel label2 = new JLabel("체중(kg): ");
		jf.add(label2);

		JTextField feild2 = new JTextField();
		jf.add(feild2);

		JLabel label3 = new JLabel("결   과 : ");
		jf.add(label3);
		
		JButton button = new JButton("확인");
		jf.add(button);
				
		BMIFrame bf = new BMIFrame(feild1, feild2, label3);
		button.addActionListener(bf);
		
		jf.setSize(450, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
