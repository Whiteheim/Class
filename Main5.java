
public class Main5 {
	public static void main(String[] args) {
		String menu1 = "땅콩버터 샌드위치";
		String menu2 = "닭가슴살";
		String menu3 = "구운 브로콜리";
		String menu4 = "저지방 우유";
		int price = 4000;
		int kcalories1 = 500;
		int kcalories2 = 600;
		double point = 8.0;
		double total = 10.0;
		boolean re_eaten = true;
		
		System.out.printf("점심식사 메뉴 : %s, %s, %s, %s\n", menu1, menu2, menu3, menu4);
		System.out.printf("가격 : %d원 정도?\n", price);
		System.out.printf("칼로리 : %d ~ %d kcal\n", kcalories1, kcalories2);
		System.out.printf("평점 : %.1f / %.1f\n", point, total);
		System.out.printf("다시 먹을 것인가? : %b", re_eaten);
				
	}
}
