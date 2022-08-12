import java.util.Iterator;

public class Simpaan {

	Chulsu_player p = new Chulsu_player();
	Minsu_com c = new Minsu_com();

	public void start() throws InterruptedException {
		System.out.println("�� ������ ��ġ��.");
		Thread.sleep(1000);
		System.out.println("�����ϰڽ��ϴ�.");
		Thread.sleep(1000);
		System.out.println("����!");
		Thread.sleep(1000);
		System.out.println("����!");
		Thread.sleep(1000);
		System.out.println("��!");
	}

	public int minsuChoic(Minsu_com c) {
		System.out.println("�� ���̱�Ŵ�!");
		int minAns = c.r_rsp();
		check(minAns);
		return minAns;
	}

	public int chulsuChoic(Chulsu_player p) {
		System.out.println("�� �����ؼ� ������! : ");
		int myAns = p.e_rsp();
		if (myAns < 1 || myAns > 3) {
			System.out.println("�̰� �� �� ����.");
		}
		check(myAns);
		return (myAns > 0 && myAns < 4) ? myAns : chulsuChoic(p);
	}

	public void check(int num) {
		switch (num) {
		case 1:
			System.out.println("����!");
			break;
		case 2:
			System.out.println("����!");
			break;
		case 3:
			System.out.println("��!");
			break;

		}
	}

	public boolean compare(int com, int player) {
		if ((com == (player - 1) || (com == 3 && player == 1))) {
			System.out.println("ö�� �¸�!");

		} else if ((com == (player + 1) || (com == 1 && player == 3))) {
			System.out.println("�μ� �¸�!");
		}
		return ((com == (player + 1) || (com == 1 && player == 3)));
	}

	public boolean draw(int com, int player) {
		if (com == player) {
			System.out.println("���º�");
		}
		return (com == player);
	}

	public void howManyWin(int win) {
		System.out.println("--------------");
		System.out.printf("%d��\n", win);
	}

	public void howManyDraw(int draw) {
		System.out.printf("%d��\n", draw);
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
