
public class whatIsValue {
	// �⺻�� - ����
	int intfield;
	byte bytefield;
	short shortfield;
	long longfield;
	// ������ - ���ڿ�, �迭
	String stringfield;
	char charfield;
	int[] arryfield;
	//�⺻�� - �Ǽ�
	double doublefield;
	float floatfield;
	
	
	boolean booleanfield;
	
	public void print() {
		System.out.println("int : " + this.intfield);
		System.out.println("double : " + doublefield);
		System.out.println(stringfield);
		System.out.println(booleanfield);
		System.out.println(charfield); // �⺻���� ����
									   // (�����ڵ� \u0000)
		System.out.println(bytefield);
		System.out.println(floatfield);
		System.out.println(arryfield);
		System.out.println(longfield);
	}
}
