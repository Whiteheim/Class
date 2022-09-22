package com.sh.sep22.com;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Computer {
	public static void com(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("EUC-KR");
			Random ran = new Random();
			int choice = ran.nextInt(3) + 1;
			int ps = Integer.parseInt(request.getParameter("rsp"));
			int win = 0;
			int lose = 0;
			int draw = 0;
			String judge = null;
			String result = null;
			if (ps == 1) {
				if (choice == 2) {
					result = "����";
					judge = "��";
					lose++;
				} else if (choice == 3) {
					result = "��";
					judge = "��";
					win++;
				}
			} else if (ps == 2) {
				if (choice == 1) {
					result = "����";
					judge = "��";
					win++;
				} else if (choice == 3) {
					result = "��";
					judge = "��";
					lose++;
				}
			} else if (ps == 3) {
				if (choice == 1) {
					result = "����";
					judge = "��";
					lose++;
				} else if (choice == 2) {
					result = "��";
					judge = "��";
					win++;
				}
				Match m = new Match(result, win, lose, draw, judge);
				request.setAttribute("m", m);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
