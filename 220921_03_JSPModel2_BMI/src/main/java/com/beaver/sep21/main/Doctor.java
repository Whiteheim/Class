package com.beaver.sep21.main;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class Doctor {
	public static void calculate(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("EUC-KR");
			String path = request.getServletContext().getRealPath("img");
			System.out.println(path);
			// 파일 선택시 파일의 경로 출력
			
			MultipartRequest mr = new MultipartRequest(request, path,
					30 * 1024 * 1024, "EUC-KR", new DefaultFileRenamePolicy());
			// 이미지 파일 요청
			
			String name = mr.getParameter("name");
			double height = Double.parseDouble(mr.getParameter("height"));
			double weight = Double.parseDouble(mr.getParameter("weight"));
			height /= 100;
			double bmi = weight / (height * height);
			String result = "저체중";
			if (bmi >= 40) {
				result = "고도비만";
			} else if (bmi >= 35) {
				result = "중등도비만";
			} else if (bmi >= 30) {
				result = "경도비만";
			} else if (bmi >= 25) {
				result = "과체중";
			} else if (bmi >= 18.5) {
				result = "정상";
			}
			
			String bmi2 = String.format("%.2f", bmi);
			double bmi3 = Double.parseDouble(bmi2);
			// 손님 객체에 데이터를 담기 위해 손님 객체의 속성들에 맞춰 자료형 변환
			String image = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image, "EUC-KR");
			image = image.replace("+", " ");
			
			Guest g = new Guest(name, height, weight, bmi3, image, result);
			// Guest 객체 불러오기
			request.setAttribute("g", g);
			// 객체 g를 "g"라는 값으로 request에 등록
		} catch (Exception e) {
		}
	}	
}


























