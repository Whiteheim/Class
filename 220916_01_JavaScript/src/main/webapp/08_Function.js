// 8. �Լ�(Function)
//	���񽺸� ����� ���� ����� ���ų�, ����� ����� ����
//		ex) �˾�â, ���� ���
//	�Ź� ���Ӱ� ����� ���� �� ������ ���� ����ϴ� ��ɵ��� �ϳ��� ���� ����ϱ� ���� ����

//function �Լ���(�Ķ����){
//		����	
//}
// �� �����̰�, �Լ���(�Ķ����); �� ȣ�� ����

// �Ķ���� ���� �Լ�
function showError(){
	alert("Error");
}
showError();
// �� �޽����� �ϳ��� ���� �� ���������� ��� �Ѵٸ�
// ex) �α��� ����, ���� ���� ��
// ���� showError(); �� �ҷ��� ���� ����

// �Ķ���� �ִ� �Լ�
/*
function sayHello(name){
	let msg = `Hello, ${name}`;
	alert(msg);
}
sayHello("����");

// �Ķ���͸� �Է����� �������
sayHello(); // undefined
*/

/*
function sayHello(name){
	let msg = "Hello";
	if (name) {
		msg += `,${name}`;
	}
	alert(msg);
}
sayHello();
sayHello("ddd");*/

let msg = "Hello"; // ��𼭳� ���� ������ ���� : ��������
console.log("�Լ� ȣ�� ��"); 
console.log(msg); 

function sayHello(name){
	let msg = "Hello";
	if (name) {
		msg += `,${name}`;
	}
	console.log("�Լ� ����");
	// �Լ� ���ο��� ���� ������ ���� : ��������
	console.log(msg); 
}

sayHello("�̱��");
console.log("�Լ� ȣ�� ��");
console.log(msg); 
// ���������� �Լ� ������ ���������� ���� �̸� �۸� ����
// ���������� ���������� ���� ���� ���� ����

// ���������� �������ٸ� �����ϱ� ��ٷο���
//		=> ������ �Լ��� Ưȭ�� �������� ���

// OR�� Ȱ���Ͽ� �⺻�� �ֱ�
function sayHello2(name){
	let newName = name || 'Friend';
	let msg = `Hello, ${newName}`;
	console.log(msg);
}
sayHello2();			// �� ���Է�
sayHello2("ȫ�浿");	// �� �Է�

// �⺻���� �����ؼ� (default value)
function sayHello3(name = 'Friend') {
	let msg = `Hello, ${name}`
	console.log(msg);
}
sayHello3();
sayHello3("ȫ�浿");

// return ���� �� ��ȯ�ϱ�
function add(num1, num2) {
	return num1 + num2;
}

let result = add(2, 3);
console.log(result);
// return�� ���� ��ȯ�� ���ÿ� �Լ��� �����ϴ� ����� ����

// ���� 
//	- �Լ��� �ѹ��� �ϳ��� �۾��� �����ϴ°��� ��õ
//		-> �ϳ��� �Լ��� ���� �۾��� �����Ѵٸ�
//			���� �Լ��� �����ϱ�
//	- �Լ����� �б� ����, � ������� �� �� �ְ� �۸�













































































