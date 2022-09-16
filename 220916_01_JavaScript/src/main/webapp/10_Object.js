// 10. ��ü(Object)

// ������� ������ '����', 3��
let dog = {
	name : "����",
	age : 3,
}
// ��ü�� �߰�ȣ �ȿ��� �����Ǹ�, key�� value������ ������ ������Ƽ(�Ӽ�)�� ��
// ���� ��ǥ�� �����ϰ�, �������� ��ǥ ���� ����
// �� �� ������ �ͱ��� �����Ͽ� ��ǥ�� ������°͵� ��õ

// ����
console.log(dog.name);
console.log(dog['age']);

// �߰�
dog.gender = "Male";
dog["furColor"] = "White";

// ����
delete dog.furColor;
////////////////////////////////////////////////////////

// ���� ������Ƽ
let name = "Beaver";
let age = 5;

/*let person = {
	name : name,
	age : age,
	gender : "Male",
}*/ 
// �̷��� ǥ�� ���� => �� ��� ��Ű��

let person = {
	name,
	age,
	gender : "Male",
}
// �̷��� ǥ�� ���� (�� ��, key�� value���� �޾ƿ� ������ �̸��� ���ƾ� ��)

// �������� �ʴ� �Ӽ��� �����ϸ�, ������ �߻����� �ʰ� undefined���� ����

// �� ��, 'in' �����ڸ� ����ϸ� ���� ã�� �Ӽ��� �ִ��� Ȯ�� ����
// in : � ���� �ִ��� Ȯ���ϱ� ���� ���
console.log('birthday' in person);	// false
console.log('age' in person);		// true	

for (let key in person) {
	console.log(key);			// key��
	console.log(person[key]);	// value��
}

// �Լ��� ��ü ����� 
function makeObject(name, age) {
	return {
		name,
		age,
		hobby : "Playing Game",
	}
}

let beaver = makeObject("Beaver", 5);
console.log(beaver);











































































