package com.sh.aug18.main;

import com.sh.aug18.character.Character;
import com.sh.aug18.game.Planet;
import com.sh.aug18.hero.Ironman;

public class Aug_18_Main1 {
	public static void main(String[] args) {
		// ���� ���� : ���丮
		// ĳ���� ���� �� �༺�� ����
		// ���� ���� -> �����û -> ��������
		// �༺��ü (�̸�, ũ��, ���̴��� ����)
		// ĳ���� (�̸�)
	Planet p = new Planet("����");
	Character c = new Character("���ʺ�");
	//�༺�� ĳ���� ���ֽ�Ŵ
	p.add(c);
	System.out.println("--------------------");
	Ironman i = new Ironman();
	// ĳ���Ͱ� ���̾���� �ڽ��� ���㿵������ ����
	c.pick(i);
	
	// ĳ���Ͱ� �����û
	c.helpAaaaa();
	
	// �༺�� ����� 3000���� ����
	p.setSize(3000);
	
	// �༺�� ���̰� ����
	p.setVisable(true);
	
	// ��� : interface�� ����� �������� ����
	// ������Ʈ �̸��� ��Ŭ�� -> Build Path -> Configure Build Path 
	// 		-> Libraries -> Add External Jars -> Jar ���� �߰�
	// interface�� �λ�� �����
	// attack();�� �ݵ�� �����ϰ� ��Ŵ
	// ���̾���� attack()�� �־� �ϼ����Ѷ�
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
