package com.sh.aug18.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sh.aug18.frame.TempFrame;

// ȭ���µ� -> �����µ� ��ȯ��
public class Aug_18_Main3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel pl = new JPanel();
		jf.add(pl);
		
		JLabel label1 = new JLabel("ȭ���µ� : "); // ���� ���
		JLabel label2 = new JLabel("�����µ� : "); // ���� ���
		JTextField field1 = new JTextField(15); // �ؽ�Ʈ �Է� ���� ũ��
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("��ȯ"); //��ư ����
		
		pl.add(label1); // �гο� �߰�
		pl.add(field1);
		pl.add(label2);
		pl.add(field2);
		pl.add(button);
		
		TempFrame tFram = new TempFrame(pl, label1, label2, field1, field2, button);
		button.addActionListener(tFram); // ��ư�� ������ �� ����� �۵��ϵ���
		
		
		jf.setSize(300, 150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ������ ���� �� ���α׷� ����
		jf.setTitle("�µ� ��ȯ��");
		jf.setVisible(true);
		
	}
}
