import java.util.Random;

public class Friend {
//	int fNum;
	Random brain = new Random();
//	public int num() {
//		return r.nextInt(100) + 1;
//	}
//	
	public int writeFriAns() {
		int think = brain.nextInt(100) + 1;
		// ģ���� �Ӹ������� �����ϳ��� ������
		// ���ڸ� ���̿� ���� ���� ���� �� ��Ȳ
		System.out.println("�Ⱥ��̰� ���� �����߽��ϴ�.");
		return think;
	}
}
