// ��������, �񱳿�����, ��ġ�������� ����� true, false
// 6. ���ǹ�
//	� ���ǿ� ���� ���Ŀ� ������ �޶����� ��

// if�� (Java�� ����)
//	if�� ��ȣ�ȿ� ������ ������ true��� ����
// if - else if - else

// switch-case
// 	case�� �پ��� ��, if�� ���� �����ϰ� ǥ�� ����

// ��� : 100��
// �ٳ��� : 200��
// Ű�� : 300��
// ��� : 500��
// ���� : 500��
// ��� ���� ������ �Է��ؼ� �� ������ ��� (alert)

let fruit = prompt("���� �ϳ� ��󺸽ð�");
switch (fruit) {
	case "���" : 
		alert(`${fruit}�� 100��`)
		break;

	case "�ٳ���" :	
		alert(`${fruit}�� 200��`)
		break;

	case "Ű��" : 
		alert(`${fruit}�� 300��`)
		break;

	case "���" :
	case "����" :
		alert(`${fruit}�� 500��`)
		break;
	
	default : 
		alert(`${fruit}�� ����`)
		break;
}



































































