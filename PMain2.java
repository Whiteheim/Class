
public class PMain2 {
	public static void main(String[] args) {
		// Escape Sequence(�̽������� ����)
		// 		 : Ư���� ���ڳ� ����� ǥ���� �� \�� �̿��� ǥ��.
		// \t : TabŰ (�鿩���� �뵵)
		// \n : New Line (���� ���� ����� �뵵)
		// \r : Carriage Return (Ŀ���� �� ������)
		// \r\n : Enter Ű ���
		// \b : Back space ���(1byte�� ����) => Java������ ��� x 
		//			C��� - �� ���� : 1byte
		//			Java - �� ���� : 2byte
		//			=> 1byte�� ���ڷ� 2byte�� ���ڸ� ������� ������ ��.
		// \0 : ���� (spaceŰ ó�� ��� ����)
		
		System.out.println("�̰� t ���\t�Ұ���");
		System.out.println("�̰� n ���\n�Ұ���");
		System.out.println("�̰� r ���\r�Ұ���");
		System.out.println("�̰� rn ���\r\n�Ұ���");
		System.out.println("�̰� b ���\b�Ұ���");
		System.out.println("�̰� 0 ���\0�Ұ���");
		
		// Eclips : ������ Ȯ�ο뵵�� ����ϴ� �ܼ�â�̱� ������ \r or \n �� �� �ϳ��� �־ enterŰ ó���� ����. 
		// ����ó�� or ��� : \n or \r �ϳ��� ���� �Ǹ� �� ������ �� �� �ִ�. (����)
		// Eclips �ȿ����� \r �� \n �� ���� �Ұ���
		// \n ���� Enter ó�� �ϰ�, ���� ���� ó������ \r,\n�� Ȯ���� ��
		
		System.out.println("\\(^_^)/");
		// \\ : \�� ���ڷ� �ν� (��θ� ���ڷ� ǥ�� �� �� ���)
		System.out.println("(\".\")");
		// \" : \ + Ư������ => ���ڷ� �ν�
		
	}
}
