package com.sh.sep28.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

// 날짜를 다룰 때 사용하기 때문에 home과 같은 패키지에 넣는게 좋음
public class DateManager {
	
	// <select> 년도에서 해마다 바꾸지 말고 값을 받아오기
	public static void getCurYear(HttpServletRequest req) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String curYear = sdf.format(now);
		req.setAttribute("cy", curYear);
	}
}
