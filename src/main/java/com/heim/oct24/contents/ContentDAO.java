package com.heim.oct24.contents;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.heim.oct24.site.SiteMapper;
import com.heim.oct24.site.SiteMember;
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
			path = req.getSession().getServletContext().getRealPath("resources/img");
			
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

			// multipartRequest로 받아온 parameter는 request parameter로 받아올 수 없기 때문에
			// 따로 set 설정을 해주어야 인식 가능
			c.setB_title(mr.getParameter("b_title"));
			c.setB_content(mr.getParameter("b_content"));
			c.setB_author(mr.getParameter("b_author"));
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
	
	// 게시판 출력
	public void viewBoard(HttpServletRequest req) {
		try {
			req.setAttribute("boards", ss.getMapper(ContentsMapper.class).getAllContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 게시글 출력
	public void viewPost(Content c, HttpServletRequest req) {
		try {
			List<Content> cm = ss.getMapper(ContentsMapper.class).viewPost(c);
			Content post = cm.get(0);
			req.setAttribute("contentsDetail", post);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 댓글 추가
	public void regComment(Comment cm, HttpServletRequest req) {
		try {
			ss.getMapper(ContentsMapper.class).writeComment(cm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 댓글 데이터 가져오기
	public void veiwComment(HttpServletRequest req) {
		try {
			req.setAttribute("comments", ss.getMapper(ContentsMapper.class).printComment());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 댓글 데이터 JSON으로 보내기
	public Comments getJSON(HttpServletRequest req) {
		return new Comments(ss.getMapper(ContentsMapper.class).printComment());
	}
	
	// 검색 게시글 출력
	public void resultSearch(Content c, HttpServletRequest req) {
		try {
			req.setAttribute("searchPost", ss.getMapper(ContentsMapper.class).searchPost(c));
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}













































































