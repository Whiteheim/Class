package com.sh.aug19.main;

import java.io.FileReader;
import java.io.InputStreamReader;

import com.sh.aug19.calculate.Calculator;
import com.sh.aug19.calculate.Costpergram;

// Java
//		����ó���� ����
// Python
//		ó���ϱ� ������ ���ص� ��

public class Aug_19_Main3 {
	public static void main(String[] args) {
		// txt������ �޾ƿͼ� �۾� �� ����
		// txt������ �����ų�, ���� �����̶��?
		try {
			FileReader fr = new FileReader ("C:\\Users\\user\\Desktop\\JavaDoc/test.txt");
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ���� / ����(g)�� �Է¹޾� (����)
		// g�� ������ ������ ���
		// ��ɿ� ���Ѱ��� Class�ϳ� ��� ����
		
		Costpergram c = new Costpergram();
		
		int cost = c.cost();
		int gram = c.gram();
//		c.costpergram(cost, gram);
	
//		int z1 = Calculator.divide(cost, gram);
		
		try {
			int z2 = Calculator.divide2(cost, gram);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// �ٸ� �޼ҵ忡�� try - catch ��� -> ���� ���� o
		// main�޼ҵ忡���� ���
		// throws : ���� ����� / �� ��� -> main �޼ҵ� �̿��� �޼ҵ�
		
		
		
		
		
		
		
		
	}
}
