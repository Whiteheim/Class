// 4. �� ��ȯ

// String()		-> ���������� ��ȯ
// Number()		-> ���������� ��ȯ
// Boolean()	-> �������� ��ȯ

// �� ��ȭ�� ���� ����
//	�ڷ����� �ٸ� �� ������ ��� ���� ��, ���ϴ� ����� ������ ���� ���ɼ��� ����

// ����, ���������� �Է� �޾� ��� ������ ������ִ� ���α׷�
// ����� document.write();

let math = prompt("��������");
let eng = prompt("��������");
let avg = (math + eng) / 2;
document.write("������� : " + avg + "<br>"); // ������ �ȵ�

let math2 = 80;
let eng2 = 90;
let avg2 = (math2 + eng2) / 2;
document.write("������� : " + avg2 + "<br>"); 

// prompt�� ���� ���� ������ ������ (String)
// "80" + "90" = 170 (x)/ "80""90" (0)
// "80""90" / 2 = 4045 �� ��������
// "80""90" �� ���ڿ��ε� ����� ��
//		�������� �ƴϴ��� ǥ���� (+ - * /)�� Ȱ���Ͽ� �����͸� ���������� ��ȯ�� �� �ִٸ� 
//		�ڵ����� �������·� �� ��ȯ�� �Ǿ� ����� ��
// 		"�ڵ� �� ��ȯ"

// �ڵ� �� ��ȯ
// ���� �������� ������ ã�� ���� ���� �߻� ���ɼ� ����
//		=> �ǵ������� ���ϴ� Ÿ��(�ڷ���)���� ��ȯ���� ����ϴ°��� ����
//			'����� �� ��ȯ'

// String() : S�� �빮�� ��� / ��ȣ���� ���� ���������� ��ȯ
document.write("String() <br>");
document.write(
	String(3) + "<br>",
	String(true) + "<br>",
	String(false) + "<br>",
	String(null) + "<br>",
	String(undefined) + "<br>",
	);
document.write("-----------------<br>");

// Number() : N�� �빮�� ��� / ��ȣ���� ���� ���������� ��ȯ
document.write("Number() <br>");
document.write(
	Number("1234") + "<br>",	// 1234
	Number("asdf") + "<br>",	// NaN (Not a Number)
	Number(true) + "<br>",		// 1
	Number(false) + "<br>",		// 0
	);
document.write("-----------------<br>");

// Boolean() : B�� �빮�� ��� / ��ȣ���� ���� �������� ��ȯ

// false�� �Ǵ� �� ����
//	- ���� 0
//	- �� ���ڿ�("") / ���� x
//	- null
//	- undefined
//	- NaN
//	�� �ܿ��� ��� true

// ���� ����
Number(null);		// 0
Number(undefined);	// NaN

let a = Number(prompt("asdf"));
document.write(a + "<br>"); // prompt�� ���� ���� �ʾҴٸ�?
							// => ���� ���� �ʾ� null �� ���
							// => Number(null); => 0
























