package com.sh.aug18.frame;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame 생성 (500, 500)
// JPanel안에 1 ~ 30까지의 숫자가 랜덤한 위치에서 나오게

// 숫자를 여러개 뽑을 때 >> 반복문
// array[]

// set
// 배경색, 글자색 등등 바꿔보기

public class NumberFrame extends JFrame {
 	JPanel p = new JPanel();
 	JLabel[] l = new JLabel[31];
 	
 	public NumberFrame() {
 		p.setLayout(null);
 		p.setBackground(Color.CYAN);
 		
 		Random r = new Random();
 		int x = 0;
 		int y = 0;
 		for (int i = 1; i < 31; i++) {
			l[i] = new JLabel("" + i);
			x = r.nextInt(500) + 1;
			y = r.nextInt(500) + 1;
			l[i].setForeground(Color.red);
			l[i].setLocation(x, y);
			l[i].setSize(50,50);
			p.add(l[i]);
		}
 		add(p);
 		setTitle("넘버프레임");
 		setSize(500,500);
 		setVisible(true);
 	}
 	
 	


}
