import java.util.Scanner;

public class Aug_03_Main8 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("�� ��? : ");
		int month = enter.nextInt();
		int day = 0; 			
		
	switch(month) {
	case 1:	case 3:	case 5: case 7:	case 8:	case 10: case 12:
		day = 31;
		System.out.printf("%d���� %d �� ���� �ֽ��ϴ�.", month, day);
		break;
	case 4:	case 6:	case 9:	case 11:
		day = 30;
		System.out.printf("%d���� %d �� ���� �ֽ��ϴ�.", month, day);
		break;
	case 2:
		day = 28;
		System.out.printf("%d���� %d �� ���� �ֽ��ϴ�.", month, day);
		break;
	default:
		System.err.printf("%d���� ���� �� �Դϴ�.\n", month);
		System.err.printf("%d���� �ִ� �޷��� ���̴ٸ� \n�� �������ñ� �ٶ��ϴ�.\n", month);
		break;
	}

}

}







