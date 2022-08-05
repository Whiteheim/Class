
public class Aug_05_Main4 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				sum += i;
			}
		}
		System.out.printf("%d\n", sum);
		System.out.println("=================================");
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((x * 4) + (y * 5) == 60) {
					System.out.printf("(%d,%d)\n",x,y);
				}
				
			}
		}
		
		
		
		
		
	}
}
