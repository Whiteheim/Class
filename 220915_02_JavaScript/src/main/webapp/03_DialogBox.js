// 3. ��ȭ���� (DialogBox)
// alert, prompt, confirm

// alert : �˸� (�Ϲ����� ���â)
alert("��� �����Ǿ����ϴ�");

// prompt : ���� �Է¹��� �� ����
let name = prompt("���� �̸���?");
alert(`�ȳ��ϼ���, ${name}��. �ݰ����ϴ�.`)
// prompt�� ���� ���� �ʰ� Ȯ�� => ����
// prompt�� ���� ���� �ʰ� ��� => null

// prompt������ default ���� ���� �� ����
// ���� �Է��� ��, �ȳ��ϰų� ��Ʈ�� �ִ� ���ҵ� ����
// 2���� �Ķ���͸� ���� �� ���� (��¿� �޼���, �Է¿� default��)
let reservation = prompt("�������� �Է����ּ���.","2022-09-16");

// confirm : Ȯ�� ���� �� ���
// �� : Ȯ�� -> true / ��� -> false
let isAdult = confirm("����� �����Դϱ�?")
alert(isAdult);

// ����
	alert("��!"); 		// �޽��� ��� ���
	prompt("������"); 	// �޽��� ���, �Է� ���
	confirm("�ͼҺ���?")// ����ڿ��� Ȯ�ι޴� ���
	
// ����
//	1. ����� â�� �� �ִ� ������ ��ũ��Ʈ�� �Ͻ������� ����
//	2. DialogBox�� ��Ÿ�ϸ� �Ұ� (��ġ, ��� �� ���� �Ұ�)
//	3. ���������� ����� ������ �ٸ�

// ����
//	������ �����ϰ� ���밡�� -> �������ϰ� ���� ���































