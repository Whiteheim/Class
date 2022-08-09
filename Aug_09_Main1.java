import java.util.Random;
import java.util.Scanner;

public class Aug_09_Main1 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[10];
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			a = r.nextInt(100) + 1;
			num[i] = a;
		}
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		Scanner enter = new Scanner(System.in);
		int[] e_num = new int[10];
		int b = 0;
		for (int i = 0; i < e_num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			b = enter.nextInt();
			e_num[i] = b; // b의 값을 배열의 i번째에 넘겨줌
		}
		for (int i : e_num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		int max = num[0]; // 배열의 0번째 숫자가 최대값이라고 가정
		int min = num[0]; // 배열의 0번째 숫자가 최소값이라고 가정
		for (int i = 0; i < e_num.length; i++) {
			if (min > num[i]) { // num[i]의 숫자가 더 작다면
				min = num[i];	// num[i]의 숫자값을 min에 옮겨담기
			} else if (max < num[i]) {  // num[i]의 숫자가 더 크다면
				max = num[i];			// num[i]의 숫자값을 max에 옮겨담기
			}
		}
		System.out.printf("최소값 : %d,\n 최대값 : %d", min, max);
	}
}








































