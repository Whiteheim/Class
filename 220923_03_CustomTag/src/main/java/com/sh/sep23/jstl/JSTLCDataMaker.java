package com.sh.sep23.jstl;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest request) {
		int[] ar = { 123, 456, 78, 91, 234 };
		request.setAttribute("ar", ar);
		
		ArrayList<Sth> al = new ArrayList<Sth>();
		al.add(new Sth("가", 1, 543.1, 1264.1));
		al.add(new Sth("나", 23, 1243.1, 770.1));
		al.add(new Sth("다", 414, 3343.1, 140.1));
		al.add(new Sth("라", 5545, 6643.1, 142.1));
		request.setAttribute("al", al);
	}
}
