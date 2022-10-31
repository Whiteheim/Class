package com.heim.oct24.contents;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class ContentDAO {
	
	@Autowired
	private SqlSession ss;
	
	// 게시글 등록
	public void writeText(Content c, HttpServletRequest req) {
		String path = null;
		MultipartRequest mr = null;
		
		try {
			path = req.getSession().getServletContext().getRealPath("/WEB-INF/img");
			mr = new MultipartRequest(req, path, 10 * 10 * 10 * 1024,
					"UTF-8", new DefaultFileRenamePolicy());
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "파일 용량 초과");
			return;
		}

		try {
			Date day = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			String today = sdf.format(day);
			String img = mr.getFilesystemName("b_img");
			img = URLEncoder.encode(img, "UTF-8").replace("+", " ");
			
			String test = c.getB_title();
			String test2 = req.getParameter("b_title");
			System.out.println(test);
			System.out.println(test2);
			
			c.setB_date(today);
			c.setB_img(img);
			
			
			int cm = ss.getMapper(ContentsMapper.class).writeContent(c);
			if (cm != 0) {
				req.setAttribute("r", "게시글이 작성되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "게시글 작성에 실패했습니다.");
		}
	}
	
	// 
	
}













































































