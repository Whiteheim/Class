
public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.printf("���� �ϱ� �� �� ������ %d�ð� �ɷȽ��ϴ�.\n", 1);
		System.out.printf("������ ���̾�Ʈ ���̶� %s�� %s�� �Ծ����ϴ�.\n", "��Ʈ��", "�ܹ��� ����ũ");
		System.out.printf("���� �� %s�� ���ٰ� ���ƿͼ� %s�� �ý��ϴ�.\n", "�ｺ��", "��� �����̹� ���α׷�");
		System.out.printf("��ħ �ð� : %s %d�� %d��\n", "����", 11, 50);
		System.out.println("���� ù �ڹ� ������ ���� �Ұ��� ������ �۾��� ���� �� �����ϴ�.");
		System.out.printf("���� ���뵵 : %.1f%%", 80.0);
		
		Thread.sleep(5000); 
	}

}


// Export�� �̿�, runnable JAR file -> .jar ���Ϸ� ���� (Launch configuration ����!)
// �޸��忡 java -jar (���ϸ�).jar �Է� �� .bat Ȯ���ڷ� ���� �� ����