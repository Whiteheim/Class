// ����
//		���� 2���� ������ �� ���� ����ϴ� ���

public class Aug_12_Main3 {

	public static void main(String[] args) {
		Calculation_Main3 c = new Calculation_Main3();
		c.printSum(10, 10);				// static O
		c.sum(10, 10, 10);				// static x
		//////////////////////////////////////////
		Calculation_Main3.printSum(10, 10);	// static o -> �޸𸮸� �� ��� (static �Ⱦ��� ����) (new Calculation(); ���� ��� ����)
//		Calculation.sum(10, 10, 10);  	// static x 

		// Java�� ���� Ŭ���� �� �ϳ��� Math�� ���� �ƶ�
		// Math ���� ��ü�� �������ʰ� �����.
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
		
	}
}
