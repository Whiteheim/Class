package com.sh.aug18.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sh.aug18.frame.BMIFrame;

public class Aug_18_Main4 {
	public static void main(String[] args) {
		// ������ BMI �˻��� JFram
		JFrame jf = new JFrame("BMI �˻�");
		// 3�� 2�� ¥�� GridLayout
		GridLayout gl = new GridLayout(3, 2);
		// JFrame�� ���̾ƿ� �Ӽ��� gl�� ���
		jf.setLayout(gl);
		
		JLabel label1 = new JLabel("����(cm): "); 
		jf.add(label1);
		
		JTextField feild1 = new JTextField();
		jf.add(feild1);
		
		JLabel label2 = new JLabel("ü��(kg): ");
		jf.add(label2);

		JTextField feild2 = new JTextField();
		jf.add(feild2);

		JLabel label3 = new JLabel("��   �� : ");
		jf.add(label3);
		
		JButton button = new JButton("Ȯ��");
		jf.add(button);
				
		BMIFrame bf = new BMIFrame(feild1, feild2, label3);
		button.addActionListener(bf);
		
		jf.setSize(450, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
