// 2. �ڷ���
// �� ������ String

let name1 = "Heim";
let name2 = 'Heim';
let name3 = `Heim`; // ���� ��ȣ, tabŰ ���� �ִ� Ű ``(backtick)

let message1 = "I'm a boy.";
let message2 = 'I\'m a boy.'; // ���� ����ǥ ��� �� \ �� �����ø� �־�
							  // '�� Ư�����ڷ� �ν��ϵ��� �ؾ���
							  
// ���ڿ� ���ο� ������ ǥ���� �� ����ϴ� Backtick
//	${������}
let message3 = `my name is ${name1}`;
document.write(message3 + '<br>');
let message4 = "my name is ${name2}"
document.write(message4 + '<br>'); // ${name2}��� ���ڿ��� �״�� ����

// ��� (ǥ����) ��� ����
let message5 = `I have ${100+1000}won.`;
document.write(message5 + '<br>');
document.write("-----------------<br>")

// �� ������ Number (���� / �Ǽ�)
let age = 100;			
let height = 180.4;

// ��Ģ���� ����
document.write(1 + 2 + "<br>"); // ���ϱ�			 
document.write(1 - 2 + "<br>");	// ����
document.write(1 * 2 + "<br>");	// ���ϱ� 
document.write(1 / 2 + "<br>");	// ������		 
document.write(6 % 4 + "<br>");	// ���� ������		 

let a = 1 / 0;
document.write(a + "<br>"); // Infinity (���Ѵ�)

let b = name1 / 2;
document.write(b + "<br>"); // NaN (Not a Number) : �� ����
document.write("-----------------<br>")

// + ������ ���� ���ڳ��� �̾��ֱ⵵ ����
let aa = "����";
let bb = "  �Դϴ�.";
document.write(aa + name1 + bb + "<br>");
document.write(aa + age + "��" + bb + "<br>");
document.write("-----------------<br>")

// �� ���� Boolean
let c = true;	// ��
let d = false;	// ����

document.write((name1 == "Heim") + "<br>");
document.write((age < 20) + "<br>");
document.write("-----------------<br>")

// �� null, undefined
let e;
document.write(e + "<br>"); // undefined : ���� �Ҵ���� ���� ����

let f = null;
document.write(f + "<br>"); // null : �������� �ʴ� ��
document.write("-----------------<br>")

// �� typeof ������ : ������ �ڷ����� �˾Ƴ� �� ���
// ���� �ڵ带 ®�� ���� �ʿ� ���� ������
// �ٸ� �����ڰ� ���� �ڵ��� ������ ���� ������ Ÿ�� (�ڷ���)�� �˾ƾ� �� �� ���
// or API�� ���� �޾ƿ� �������� �ڷ����� �ƶ󳻼� �ٸ� ������� ó���ؾ� �� �� ���
document.write(typeof name1 + "<br>");
document.write(typeof age + "<br>");
document.write(typeof c + "<br>");
document.write(typeof e + "<br>");
document.write(typeof f + "<br>");		// Object -> JS�� ù ���� 
document.write("-----------------<br>")






















































