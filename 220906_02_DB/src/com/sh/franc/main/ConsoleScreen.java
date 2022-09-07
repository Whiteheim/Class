package com.sh.franc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.sh.franc.Reserve.Reservation;
import com.sh.franc.Reserve.Resist;

// 사용자가 Console 볼 수 있거나, Console에 입력할 수 있도록 만드는 Class

// 아래 메뉴를 볼 수 있는 기능

// 1. 예약하기 기능 (직접 입력, 날짜는 연-월-일/ 시:분)
// 2. 매장 등록 기능 
// 3. 전체 예약 확인 기능 (날짜는 연-월-일 요일 오전/오후 시:분)
// 4. 전체 매장 조회 (위치(좌석수) - 사장님 이름)
// 5. 매장 찾기 (최소 좌석 수)
// 6. 예약 찾기 (예약자의 이름 입력하면 예약자의 정보 출력)
// 9. 프로그램 종료

public class ConsoleScreen {

	public static int selectNum() {
		Scanner k = new Scanner(System.in);
		// 메뉴 선택 창
		System.out.println("=====원하시는 메뉴의 번호를 입력해주세요=====");
		System.out.println("|1.     예약     | 2. 매장 등록 | 3. 예약확인|");
		System.out.println("|4. 전체매장조회 | 5. 매장 찾기 | 6. 예약찾기|");
		System.out.println("|7.  예약변경    | 8. 예약취소  | 9.   종료  |");
		System.out.println("=============================================");
		// 번호 입력
		System.out.print("번호 입력 : ");
		int number = k.nextInt();
		return number;
	}

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static Reservation showRsvMenu() throws ParseException {
		Scanner k = new Scanner(System.in);

		System.out.print("예약자 : ");
		String name = k.next();

		System.out.print("예약 날짜 (YYYY-MM-DD/HH:mm) : ");
		String when = k.next();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD/HH:mm");
		Date when2 = sdf.parse(when);

		System.out.print("연락처 : ");
		String phoneNum = k.next();

		System.out.print("예약할 지점 : ");
		String location = k.next();

		Reservation r = new Reservation(0, name, when2, phoneNum, location);
		return r;

	}

	// 전체 예약 확인
	public static void showRsvResult(ArrayList<Reservation> rsvs) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
		for (Reservation r : rsvs) {
			System.out.printf("예약번호 : %d\n", r.getNo());
			System.out.printf("예약자 이름 : %s\n", r.getName());
			System.out.printf("휴대폰 번호 : %s\n", r.getPhone());
			System.out.printf("지점명 : %s\n", r.getLocation());
			System.out.println(sdf.format(r.getWhen()));
		}
	}

	public static void showReslutMenu(ArrayList<Resist> alrs) {
		for (Resist r : alrs) {
			System.out.printf("%s(%d석)", r.getLocation(), r.getSeat());
			System.out.printf("- %s\n", r.getOwner());
		}
	}

	// 점포 찾기
	public static Resist showResMenu() {
		Scanner k = new Scanner(System.in);

		System.out.print("점포 위치 : ");
		String location = k.next();

		System.out.print("점주 성함 : ");
		String owner = k.next();

		System.out.print("좌석 수 : ");
		int seat = k.nextInt();

		Resist r = new Resist(location, owner, seat);
		return r;
	}

// 좌석수로 매장 찾기	
	public static Resist searchR() {
		Scanner k = new Scanner(System.in);

		System.out.print("좌석수로 검색 : ");
		int seat = k.nextInt();

		return new Resist(null, null, seat);
	}

// 예약 찾기
	public static String searchReserve() {
		Scanner k = new Scanner(System.in);

		System.out.print("예약자 이름 : ");
		String name = k.next();

		return name;
	}

// 7. 예약 정보 수정 (예약 번호를 입력하면 연락처만 변경 가능)
	public static Reservation cReserve() {
		Scanner k = new Scanner(System.in);
		
		System.out.println("예약번호 : ");
		int rNum = k.nextInt();
		
		System.out.println("변경하실 휴대폰 번호 :");
		String pNum = k.next();
		
		return new Reservation(rNum, null, null, pNum, null);
		
	}
// 8. 예약 취소 (예약번호 입력 후, 예약 취소)
	public static Reservation cancelR() {
		Scanner k = new Scanner(System.in);
		
		System.out.println("예약번호 : ");
		int rNum = k.nextInt();
		
		return new Reservation(rNum, null, null, null, null);
	}

	
	
	
	
	
	
	}
