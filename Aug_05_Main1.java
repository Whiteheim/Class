
public class Aug_05_Main1 {
	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print("��"); } System.out.println(); }
		 * 
		 * System.out.println("=======================");
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					System.out.print("��");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("");
		}

		System.out.println("==========================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("��");
		}

		System.out.println("==========================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "��" : "  ");
			}
			System.out.println("  ");
		}

		System.out.println("==========================");

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i % 2 == 0 ? "��" : "��");
			}
			System.out.println("  ");
		}

		System.out.println("==========================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print(i % 2 == 0 ? "��" : "��");
			}
			System.out.println("  ");
		}

		System.out.println("==========================");

		for (int i = 0;  i < 5; i++) {
				for (int j = 0; j<=(i*2) ; j++) {
					System.out.print(i % 2==0 ? "��":"��");
				
			}
				System.out.println();
		}
	
		System.out.println("==========================");	

		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i*2); j++) {
				System.out.print("*");
				
			}
		System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
