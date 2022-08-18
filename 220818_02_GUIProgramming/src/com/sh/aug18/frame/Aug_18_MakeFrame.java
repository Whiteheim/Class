package com.sh.aug18.frame;


import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame(���� ������ ����) : Swing���� �����츦 ��Ÿ���� Class
//		JPanel(���� ������ ����), JBotton(��ư�� ���), JLabel(��), JTextField(���� �Է�), ...etc
// layout : flowLayout - ��� ����
// 			BorderLayout - Frame�� ���� ����
//			GridLayout - ���� ����
//			setLocation, setBounds - ��ġ ���� ����



 public class Aug_18_MakeFrame extends JFrame{
	JPanel pl;
	
	public Aug_18_MakeFrame() {
		setSize(500, 500);		// �������� ������
		setTitle("GUI ����");	// �������� ����
		pl = new JPanel();		// ���� ������ (�г� �ϳ� ����)
		pl.setLayout(new FlowLayout()); // ��� ����
		for (int i = 1; i <= 10 ; i++) {
			pl.add(new JButton("��ư" +  i));	// pl�ȿ� button�� �־�� ����
		}
		add(pl); // JPanel�� JFrame�ȿ� �ֱ�
		setVisible(true); // JFrame ���̰� �ϴ� ���
		
		
		
		
		
		
	}

	
	
}
