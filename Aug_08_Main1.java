import java.util.Scanner;

public class Aug_08_Main1 {

	public static void number(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}

	public static void number(int x, int y, int z) {
		System.out.printf("%d + %d + %d= %d\n", x, y, z, x + y + z);
		
	}
// ���� n���� ������ �� ���� ����ϴ� �Լ�
// �Լ� �Ķ���ͷ� ���� ������
//	�ڷ��� ... ������ => �Ķ���� ������
	public static void number(int ...n) { // ******
		int mul = 1;
		for (int i = 0; i < n.length; i++) {
			//�Լ� ������ ����Ҷ��� �迭ó�� ���
			mul *= n[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		
	number();	
	}
}
