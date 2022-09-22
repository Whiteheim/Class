package com.sh.sep22.main;

import java.util.Random;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

public class M {
	private int tried;
	private int strike;
	private int ball;

	private static final M PLAY = new M();

	public M() {
		// TODO Auto-generated constructor stub
	}

	public static M getPlay() {
		return PLAY;
	}

	public static String randNum() {
		int r = new Random().nextInt(976) + 12; // 12 ~ 987
		String ans = String.format("%03d", r); // "012" ~ "987"

		if (ans.charAt(0) == ans.charAt(1) || ans.charAt(0) == ans.charAt(2) || ans.charAt(1) == ans.charAt(2)) {
			return randNum();
		}
		return ans;
	}

	public static void play(HttpServletRequest request) {
		String n = request.getParameter("number");
		String rn = randNum();
		StringTokenizer st = new StringTokenizer(n);
		StringTokenizer st2 = new StringTokenizer(rn);

		int tried = 0;
		int strike = 0;
		int ball = 0;

		tried++;
		for (int i = 0; st.hasMoreTokens(); i++) {
			int sn = Integer.parseInt(st.nextToken());
			for (int j = 0; st2.hasMoreTokens(); j++) {
				int sn2 = Integer.parseInt(st.nextToken());
				if (sn == sn2) {
					strike++;
				} else if (sn != sn2) {
					ball++;
				}
			}
		}

	}
}
