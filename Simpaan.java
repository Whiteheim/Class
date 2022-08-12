import java.util.Iterator;

public class Simpaan {

	Chulsu_player p = new Chulsu_player();
	Minsu_com c = new Minsu_com();

	public void start() throws InterruptedException {
		System.out.println("각 선수들 위치로.");
		Thread.sleep(1000);
		System.out.println("시작하겠습니다.");
		Thread.sleep(1000);
		System.out.println("가위!");
		Thread.sleep(1000);
		System.out.println("바위!");
		Thread.sleep(1000);
		System.out.println("보!");
	}

	public int minsuChoic(Minsu_com c) {
		System.out.println("넌 못이길거다!");
		int minAns = c.r_rsp();
		check(minAns);
		return minAns;
	}

	public int chulsuChoic(Chulsu_player p) {
		System.out.println("잘 생각해서 내보자! : ");
		int myAns = p.e_rsp();
		if (myAns < 1 || myAns > 3) {
			System.out.println("이건 낼 수 없어.");
		}
		check(myAns);
		return (myAns > 0 && myAns < 4) ? myAns : chulsuChoic(p);
	}

	public void check(int num) {
		switch (num) {
		case 1:
			System.out.println("가위!");
			break;
		case 2:
			System.out.println("바위!");
			break;
		case 3:
			System.out.println("보!");
			break;

		}
	}

	public boolean compare(int com, int player) {
		if ((com == (player - 1) || (com == 3 && player == 1))) {
			System.out.println("철수 승리!");

		} else if ((com == (player + 1) || (com == 1 && player == 3))) {
			System.out.println("민수 승리!");
		}
		return ((com == (player + 1) || (com == 1 && player == 3)));
	}

	public boolean draw(int com, int player) {
		if (com == player) {
			System.out.println("무승부");
		}
		return (com == player);
	}

	public void howManyWin(int win) {
		System.out.println("--------------");
		System.out.printf("%d승\n", win);
	}

	public void howManyDraw(int draw) {
		System.out.printf("%d무\n", draw);
		System.out.println("--------------");
	}

	public void loading(Minsu_com c, Chulsu_player p) throws InterruptedException {
		start();
		int chulsu = 0;
		int minsu = 0;
		boolean result = false;
		boolean drawresult = false;
		for (int i = 0; true; i++) {
			for (int j = 0; true; j++) {
				chulsu = chulsuChoic(p);
				minsu = minsuChoic(c);
				result = compare(minsu, chulsu);
				draw(minsu, chulsu);
				if (drawresult) {
					howManyDraw(j);
				} else if (result) {
					howManyWin(i);
				}
				break;
			}
		}
	}

}
