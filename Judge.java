
public class Judge {
	String[] rulebook = new String[] { " ", "가위", "바위", "보" };

	public void readRulebook() {
		System.out.println("================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("================");
	}

	public int askAns(Maru m) {
		System.out.printf("마루 뭐 낼거니? : ");
		int maruAns = m.fire();
		return (maruAns >= 1 && maruAns <= 3) ? maruAns : askAns(m);
	}

	public int askAns(Brother b) {
		int broAns = b.fire();
		return broAns;
	}

	// 누가 뭐 냈는지
	public void printHand(int broHand, int maruHand) {
		System.out.printf("마루는 %s\n", rulebook[maruHand]);
		System.out.printf("동생은 %s\n", rulebook[broHand]);
	}

	// 판정
	public boolean judgeWin(int maruHand, int broHand, Maru m) {
		int result = maruHand - broHand;
		// 마루 1 일 때 동생 2 = -1 짐
		// 				     3 = -2 이김
		// 마루 2 일 때 동생 1 = 1  이김
		//					 3 = -1 짐
		// 마루 3 일 때 동생 1 = 2 짐
		//					 2 = 1 이김
		// ==> 마루 - 동생 = -1 or 2일때 마루가 짐
		if (result == 0) {
			System.out.println("무승부");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("동생 승");
		} else {
			System.out.println("마루 승");
			m.win++;
		}
		return (result == -1 || result == 2); //이 상황의 true 값이 리턴
	}

	public void sayMaruWin(Maru m) {
		System.out.printf("마루는 %d번 비겼고, %d번 이김\n", m.draw, m.win);
	}
	
	// 시작
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
