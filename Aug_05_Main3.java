
public class Aug_05_Main3 {
	public static void main(String[] args) throws InterruptedException {
		for (int day = 0; day < 30; day++) {
			for (int hour = 0; hour < 24; hour++) {
				for (int minutes = 0; minutes < 60; minutes++) {
					for (int seconds = 1; seconds < 60; seconds++) {
						System.out.printf("[Day%02d]%02d:%02d:%02d\n", day, hour, minutes, seconds);
						Thread.sleep(1000);
					}
				}
			}
		}
	}
}
