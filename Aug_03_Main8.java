import java.util.Scanner;

public class Aug_03_Main8 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("몇 월? : ");
		int month = enter.nextInt();
		int day = 0; 			
		
	switch(month) {
	case 1:	case 3:	case 5: case 7:	case 8:	case 10: case 12:
		day = 31;
		System.out.printf("%d월은 %d 일 까지 있습니다.", month, day);
		break;
	case 4:	case 6:	case 9:	case 11:
		day = 30;
		System.out.printf("%d월은 %d 일 까지 있습니다.", month, day);
		break;
	case 2:
		day = 28;
		System.out.printf("%d월은 %d 일 까지 있습니다.", month, day);
		break;
	default:
		System.err.printf("%d월은 없는 달 입니다.\n", month);
		System.err.printf("%d월이 있는 달력을 보셨다면 \n얼른 도망가시기 바랍니다.\n", month);
		break;
	}

}

}







