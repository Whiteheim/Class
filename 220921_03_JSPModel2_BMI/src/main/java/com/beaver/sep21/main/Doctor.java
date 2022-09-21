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
			// ���� ���ý� ������ ��� ���
			
			MultipartRequest mr = new MultipartRequest(request, path,
					30 * 1024 * 1024, "EUC-KR", new DefaultFileRenamePolicy());
			// �̹��� ���� ��û
			
			String name = mr.getParameter("name");
			double height = Double.parseDouble(mr.getParameter("height"));
			double weight = Double.parseDouble(mr.getParameter("weight"));
			height /= 100;
			double bmi = weight / (height * height);
			String result = "��ü��";
			if (bmi >= 40) {
				result = "����";
			} else if (bmi >= 35) {
				result = "�ߵ��";
			} else if (bmi >= 30) {
				result = "�浵��";
			} else if (bmi >= 25) {
				result = "��ü��";
			} else if (bmi >= 18.5) {
				result = "����";
			}
			
			String bmi2 = String.format("%.2f", bmi);
			double bmi3 = Double.parseDouble(bmi2);
			// �մ� ��ü�� �����͸� ��� ���� �մ� ��ü�� �Ӽ��鿡 ���� �ڷ��� ��ȯ
			String image = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image, "EUC-KR");
			image = image.replace("+", " ");
			
			Guest g = new Guest(name, height, weight, bmi3, image, result);
			// Guest ��ü �ҷ�����
			request.setAttribute("g", g);
			// ��ü g�� "g"��� ������ request�� ���
		} catch (Exception e) {
		}
	}	
}


























