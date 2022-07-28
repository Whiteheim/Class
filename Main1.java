
public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.printf("어제 하교 한 뒤 집까지 %d시간 걸렸습니다.\n", 1);
		System.out.printf("저녁은 다이어트 중이라 %s와 %s를 먹었습니다.\n", "위트빅스", "단백질 쉐이크");
		System.out.printf("수업 후 %s에 갔다가 돌아와서 %s를 봤습니다.\n", "헬스장", "밴드 서바이벌 프로그램");
		System.out.printf("취침 시간 : %s %d시 %d분\n", "오후", 11, 50);
		System.out.println("어제 첫 자바 수업을 들은 소감은 귀찮은 작업이 많은 것 같습니다.");
		System.out.printf("수업 성취도 : %.1f%%", 80.0);
		
		Thread.sleep(5000); 
	}

}


// Export를 이용, runnable JAR file -> .jar 파일로 저장 (Launch configuration 주의!)
// 메모장에 java -jar (파일명).jar 입력 후 .bat 확장자로 저장 후 실행