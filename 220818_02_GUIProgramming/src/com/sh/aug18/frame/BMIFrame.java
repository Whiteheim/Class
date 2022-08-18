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
		String result = "저체중";
		if (bmi >= 40) {
			result = ("고도비만");
		} else if (bmi >= 35) {
			result = ("중증도비만");
		} else if (bmi >= 30) {
			result = ("경도비만");
		} else if (bmi >= 25) {
			result = ("과체중");
		} else if (bmi >= 23) {
			result = ("정상");
		}
		
		// 콘솔에 문자를 띄우려면
		// System.out.println(); 사용
		// Frame에 문자를 띄우려면
		// String.format();
		String finalResult = String.format("BMI : %.2f, 당신은 %s입니다.",bmi, result);
		label.setText(finalResult);
	}
		
		
		
		
		
		
		
		
		
		
		
		

}
