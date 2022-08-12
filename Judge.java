
public class Judge {
	String[] rulebook = new String[] { " ", "����", "����", "��" };

	public void readRulebook() {
		System.out.println("================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("================");
	}

	public int askAns(Maru m) {
		System.out.printf("���� �� ���Ŵ�? : ");
		int maruAns = m.fire();
		return (maruAns >= 1 && maruAns <= 3) ? maruAns : askAns(m);
	}

	public int askAns(Brother b) {
		int broAns = b.fire();
		return broAns;
	}

	// ���� �� �´���
	public void printHand(int broHand, int maruHand) {
		System.out.printf("����� %s\n", rulebook[maruHand]);
		System.out.printf("������ %s\n", rulebook[broHand]);
	}

	// ����
	public boolean judgeWin(int maruHand, int broHand, Maru m) {
		int result = maruHand - broHand;
		// ���� 1 �� �� ���� 2 = -1 ��
		// 				     3 = -2 �̱�
		// ���� 2 �� �� ���� 1 = 1  �̱�
		//					 3 = -1 ��
		// ���� 3 �� �� ���� 1 = 2 ��
		//					 2 = 1 �̱�
		// ==> ���� - ���� = -1 or 2�϶� ���簡 ��
		if (result == 0) {
			System.out.println("���º�");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("���� ��");
		} else {
			System.out.println("���� ��");
			m.win++;
		}
		return (result == -1 || result == 2); //�� ��Ȳ�� true ���� ����
	}

	public void sayMaruWin(Maru m) {
		System.out.printf("����� %d�� ����, %d�� �̱�\n", m.draw, m.win);
	}
	
	// ����
	public void start(Maru m, Brother b) {
		readRulebook();
		int maruHand;
		int broHand;
		while (true) {
			maruHand = askAns(m);
			broHand = askAns(b);
			printHand(broHand, maruHand);
			System.out.println("===================");
			if (judgeWin(maruHand, broHand, m)) {
				sayMaruWin(m);
				break;
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
