import java.util.Iterator;

public class Aug_08_Main2 {
	public static void main(String[] args) {
		String[] ss = {"����", "����", "����", "^_^"};
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println("======================");
		String s = null;
		for (int i = 0; i < ss.length; i++) {
			s = ss[i];
			System.out.println(s);
		}
		System.out.println("======================");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);
		System.out.println("======================");
		/* for-each (���� for ��)
		 *  	�迭�� ��Ҹ� �����Ҷ� ��� X
		 *  		: ������ ���°� �ƴ� �ӽ÷� ������ ����ϴ� ����
		 *  		  �������� ������ ����
		 *  	���� ���� �Ұ���
		 *  		: i(�ε���)�� ���� ���ϴ� ������ ����� �� ����
		 *  		  -> Ȱ�뵵�� ���� (�迭�� ��ü�� Ȯ���ϴµ� ���)
		 *  for (�ڷ��� ������ : �迭) {
		 *  	����
		 *  }
		 *  
		 */
		for (String sss : ss) { // �迭 ss�� ��Ҹ� sss�� ����
			System.out.println(sss); // �迭�� ��� ������� ���
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
