import java.util.Iterator;

// 이중 for 문 : for(){for()} => 중첩 for 문

public class Aug_04_Main5 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i값 : %d =====\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j값 : %d\n", j);

			}
		}
		/*
		 * for (int i = 2; i <= 9; i++) { 
		 * 		System.out.printf("===%d단===\n", i); 
		 * 		for (int j = 1; j <= 9; j++) { 
		 * 		System.out.printf("%d x %d = %d\n", i, j, i * j); } }
		 */
		for (int i = 2; i < 10; i++) {
			System.out.printf("===%d단===\t", i);
		}System.out.println();
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}

		
		for (int i = 1; i < 6 ; i++) {
			System.out.println("ㅋ");
			for (int j = 1; j < 2; j++) {
				System.out.printf("ㅋ");
			}
				
		}
	
	
	
	
	
	
	
	
	
	
	
	}
}