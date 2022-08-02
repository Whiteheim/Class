import java.util.Scanner;

public class Aug_02_Main7 {
	//��������
	/* ������ �ϳ� ������
	 * 1 + 2 + 3 + .... + ������ ����
	 * �� ���� ���� �����ִ� �Լ�
	 */
	 public static int add(int x) {
		 int answer = (x == 1) ? 1 : (x + add(x-1));
		 return answer;
		// return x * (x + 1) / 2;
	 }
	 
	 public static int fac(int x) {
		 int fac = (x == 1) ? 1 : (x * fac(x-1));
		 return fac;
	 }
		 
	 public static int fb (int x) {
		 int fb = (x < 3) ? 1 : (fb(x - 1) + fb(x - 2));
		 return fb;
	 }
	
	public static void main(String[] args) {
		 int a = add(5);
		 System.out.println(a);
		 
		 int b = fac(6);
		 System.out.println(b);
		 
		 int c = fb(1);
		 System.out.println(c);
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 /* ����� ȣ�� (recursive call)
	  * 	: �Լ� �ӿ��� �ڱ� �ڽ�(�Լ�)�� �� ȣ�� -> �ݺ�
	  * 
	  * add(1) = 1
	  * add(2) = 3 -> 2 + add(1); -> 2 + 1
	  */
}
