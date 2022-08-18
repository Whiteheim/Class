package com.sh.aug18.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMIFrame implements ActionListener {
	private JTextField htf;
	private JTextField wetf;
	private JLabel label;

	public BMIFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public BMIFrame(JTextField htf, JTextField wetf, JLabel label) {
		super();
		this.htf = htf;
		this.wetf = wetf;
		this.label = label;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		double height = Double.parseDouble(htf.getText());
		double weight = Double.parseDouble(wetf.getText());
		height /= 100;
		double bmi = weight / (height * height);
		String result = "��ü��";
		if (bmi >= 40) {
			result = ("����");
		} else if (bmi >= 35) {
			result = ("��������");
		} else if (bmi >= 30) {
			result = ("�浵��");
		} else if (bmi >= 25) {
			result = ("��ü��");
		} else if (bmi >= 23) {
			result = ("����");
		}
		
		// �ֿܼ� ���ڸ� ������
		// System.out.println(); ���
		// Frame�� ���ڸ� ������
		// String.format();
		String finalResult = String.format("BMI : %.2f, ����� %s�Դϴ�.",bmi, result);
		label.setText(finalResult);
	}
		
		
		
		
		
		
		
		
		
		
		
		

}
