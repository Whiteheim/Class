package com.sh.sep28.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

// ��¥�� �ٷ� �� ����ϱ� ������ home�� ���� ��Ű���� �ִ°� ����
public class DateManager {
	
	// <select> �⵵���� �ظ��� �ٲ��� ���� ���� �޾ƿ���
	public static void getCurYear(HttpServletRequest req) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String curYear = sdf.format(now);
		req.setAttribute("cy", curYear);
	}
}
