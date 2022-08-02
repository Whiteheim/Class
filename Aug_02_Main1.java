
public class Aug_02_Main1 {

	public static void print_bigger(int a , int b) { //기능(출력)을 만드는 함수 
		int big_num = (a > b) ? a : b; 
		System.out.println(big_num);
	}
		
	public static double get_bigger(double a, double b) { //결과값을 생성하는(구하는) 함수 -> 값을 내보내기 위해 사용하는 경우
		double big_num = (a > b) ? a : b;
		big_num *= 1000;
		return big_num;
			
	}
		
	public static void main(String[] args) throws InterruptedException {
		print_bigger(10, 20);
		double big_num = get_bigger(10, 20);	
		System.out.println(big_num);
		Thread.sleep((int) big_num);
	}
}
