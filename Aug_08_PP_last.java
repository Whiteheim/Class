
public class Aug_08_PP_last {
	public static void main(String[] args) {
		int value = 10;
		if (value >= (1 << 3)) {
			System.out.println("흡연실");
			value -= (1 << 3);
		}
		if (value >= (1 << 2)) {
			System.out.println("wifi");
			value -= (1 << 2);

		}
		if (value >= (1 << 1)) {
			System.out.println("주차장");
			value -= (1 << 1);
		}
		if (value >= (1 << 0)) {
			System.out.println("24h");
			value -= (1 << 0);
		}
		System.out.println(value);
		System.out.println("=================================");
		
		int value2 = 13;
		String[] option = {"24시간","주차장", "WIFI","흡연실"};
		for (int i = option.length - 1; i >= 0; i--) {
			if (value2 >= (1 <<i)) {
				System.out.println(option[i]);
				value2 -= (1 << i);
			}
		}
		System.out.println(value2);
	}
}