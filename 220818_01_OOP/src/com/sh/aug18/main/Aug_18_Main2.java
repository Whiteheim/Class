// Java GUI���α׷� (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : �ڹ� ��â�⿡ ���� GUI�� ���̺귯��
// 		�ü��(OS)�� ���� ����� �޶��� �빮��, ������ ����� �������̾���.
// Swing : AWT �������� ���� ���̺귯�� 
//		 ������ ���α׷� - �ڹٷ� ������ ���� : ����, �� ����ȭ �� C��� ������ �ֱ⶧��
//		 ������ ���α׷��� �� �ȸ��� : ��/�������� �Ѿ�� �߼��̱� ����
//		 - �����ε� ����, ȿ�뼺�� ������
// 		 - Android App ������ �����ϴµ� ������ ��
// Java FX : Swing�� ���� ó���ӵ��� �����Ͽ� ���
//			�پ��� ��ɵ鵵 �߰� + ���� �ܰ��� �ٹ̴� �͵� ��������
// 			������ ��/���ʿ��� �����ϸ� �Ǳ� ������ �� ����������

package com.sh.aug18.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sh.aug18.hero.Hulk;

public class Aug_18_Main2 {
	public static void main(String[] args) {
	// Swing , AWT�� ǥ��	
	JFrame jf = new JFrame("����");
	JButton jb = new JButton("���ʺ�");
	jf.add(jb);
	
	// Hulk - actionPerformed()�� �ݵ�� �ʿ�
	//			�̿ϼ� �޼ҵ�
	
	// Hulk ����
	Hulk h = new Hulk();
	
	// ĳ���Ͱ� ���㿵������ ����
	jb.addActionListener(h);
	
	// �༺�� ũ��, ���� ���̵���, 
	jf.setSize(500, 500);
	jf.setVisible(true);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
