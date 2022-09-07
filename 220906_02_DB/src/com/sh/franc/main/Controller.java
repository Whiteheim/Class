package com.sh.franc.main;

import java.util.ArrayList;

import com.sh.franc.Reserve.Reservation;
import com.sh.franc.Reserve.Resist;

public class Controller {
	public static void main(String[] args) throws InterruptedException {
		// �Է¹��� �������� ���� ���� DAO Ŭ������ ����ǵ���
		// ���⼭ ����
		int menu = 0;
		Reservation rsv = null;
		String result = null;
		ArrayList<Reservation> rsvResult = null;
		ArrayList<Resist> alrsResult = null;
		Resist res = null;
		Resist srt = null;
		String srs = null;
		
		
		System.out.println("���� ���α׷�");
		while (true) {
			try {
				menu = ConsoleScreen.selectNum();
				if (menu == 9) {
					System.out.println("���α׷��� �����մϴ�");
					break;
				} else if (menu == 1) {
					rsv = ConsoleScreen.showRsvMenu();
					result = DAO.book(rsv);
					ConsoleScreen.printResult(result);

				} else if (menu == 2) {
					res = ConsoleScreen.showResMenu();
					result = DAO.resist(res);
					ConsoleScreen.printResult(result);
				} else if (menu == 3) {
					rsvResult = DAO.checkR();
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 4) {
					alrsResult = DAO.checkStore();
					ConsoleScreen.showReslutMenu(alrsResult);
				} else if (menu == 5) {
					srt = ConsoleScreen.searchR();
					alrsResult = DAO.searchS(srt);
					ConsoleScreen.showReslutMenu(alrsResult);
				} else if (menu == 6) {
					srs = ConsoleScreen.searchReserve();
					rsvResult = DAO.SearchReserve(srs);
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 7) {
					rsvResult = DAO.SearchReserve(srs);
					ConsoleScreen.showRsvResult(rsvResult);

					srs = ConsoleScreen.searchReserve();
					result = DAO.cReserve(rsv);
					ConsoleScreen.printResult(result);
					
					rsvResult = DAO.SearchReserve(srs);
					ConsoleScreen.showRsvResult(rsvResult);
				} else if (menu == 8) {
					rsv = ConsoleScreen.cancelR();
					result = DAO.cancelR(rsv);
					ConsoleScreen.printResult(result);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
