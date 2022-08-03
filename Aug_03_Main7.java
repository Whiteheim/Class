import java.util.Scanner;

public class Aug_03_Main7 {
	public static void main(String[] args) {
		/* 직업에 대해
		 * DBA : 상위 데이터 베이스 관리자
		 * 	=> 전원 관리 / 데이터 백업or복구 / 명령어 활용 C/R/U/D / 서비스 활용
		 * 
		 * DBP : 데이터베이스 프로그래머
		 * 	=> 명령어로 C/R/U/D / 서비스 활용
		 * 
		 * DBU : 사용자
		 *  => 서비스 활용
		 */
		
		Scanner enter = new Scanner(System.in);
		System.out.println("DBA? DBP? DBU?");
		String job = enter.next();
		System.out.printf("%s\n",job);
		
		switch (job) {
		case "DBA":
		case "dba":
			System.out.println("전원관리");
			System.out.println("백업/복구");
		case "DBP":
		case "dbp":
			System.out.println("명령어로 CRUD");
		case "DBU":
		case "dbu":
			System.out.println("서비스활용");
			break;
		default: System.out.println("백수신가요?");
			break;
		}
		
		
	}
}
