package com.sh.sep28.Model;

import java.io.File;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sh.sep28.DBManager.DBManager;
import com.sh.sep28.info.Member;

public class MemberDAO {

	// ���� �ϱ� ���� method
	public static void join(HttpServletRequest req) {
		// ���� ���ε� �õ�
		// 10 * 1024 * 1024 (10�ް�) / ���� ũ�� �ʰ��� ȸ������ ����
		String path = null;
		MultipartRequest mr = null;
		try {
			path = req.getServletContext().getRealPath("img");
			mr = new MultipartRequest(req, path, 10 * 1024 * 1024, 
					"EUC-KR", new DefaultFileRenamePolicy());

		} catch (Exception e) {// ���� ���ε� ����
			e.printStackTrace();
			req.setAttribute("r", "������ �뷮�� �ʹ� Ů�ϴ�.");
			return; // ���ε忡 �����ϸ� ���� DB�۾� �ߴ� (��������) // break�� �ݺ��� ����� ���
		}

		// ���� ���ε� ������ DB �۾� ��� ����
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect("myPool");

			String id = mr.getParameter("m_id");
			String pw = mr.getParameter("m_pw");
			String pN = mr.getParameter("m_phoneNum");
			String y = mr.getParameter("m_y");
			int m = Integer.parseInt(mr.getParameter("m_m")); // ���ڸ� ���ڷ� �޾ƿ;� �ؼ� int ���
			int d = Integer.parseInt(mr.getParameter("m_d"));
			String bd = String.format("%s%02d%02d", y, m, d);
			String img = mr.getFilesystemName("m_picture");
			img = URLEncoder.encode(img, "EUC-KR").replace("+", " "); // ���� �� ��κ��� + �� ó������ �ʰ�

			String sql = "insert into information values (?, ?, ?, to_date(?, 'YYYYMMDD'), ?)";

			pstmt = con.prepareStatement(sql); // sql�� ����

			// ?�� �� �� ä���
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, pN);
			pstmt.setString(4, bd);
			pstmt.setString(5, img);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "������ �Ϸ�Ǿ����ϴ�.");
			}

		} catch (Exception e) { // �ߺ��� ���̵� / DB���� ������� ���� ��
			e.printStackTrace();
			// ���� ������ ȸ�������� ����, ���������� ���ε� �� ����
			// ���ε�� ���� ���� ���� (Java�̿�, ���ϸ��� �ѱ�ó�� x)
			File f = new File(path + "/" + mr.getFilesystemName("m_picture"));
			f.delete();
			req.setAttribute("r", "���� ���� (��������)");
		}
		DBManager.close(con, pstmt, null);

	}

	public static void login(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect("myPool");
			req.setCharacterEncoding("EUC-KR");
			String id = req.getParameter("m_id");
			String pw = req.getParameter("m_pw");

			// String sql = "select * from information";
			// String sql = "select * from information where m_id = ? and m_pw = ?";
			// ��ŷ ��� �� SQL Injection �� ����
			// ���Ȼ� ������� �̿��ؼ� ������ ���̽��� ���������� ������ �ϰ� �ϴ� ���
			String sql = "select * from information where m_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // �����Ͱ� �ִ��� , �ִٸ� �� �����͸� �����Ѽ�
				String dbPw = rs.getString("m_pw");
				if (dbPw.equals(pw)) {
					Member m = new Member(rs.getString("m_id"), dbPw, rs.getString("m_phoneNum"), rs.getDate("m_bd"),
							rs.getString("m_picture"));
					req.getSession().setAttribute("loginMember", m);
					req.getSession().setMaxInactiveInterval(600);

					Cookie c = new Cookie("lastLoginId", id);
					c.setMaxAge(60 * 60 * 24 * 5); // 5�ϰ� ����
					res.addCookie(c);
					req.setAttribute("r", "�α��� ����");
				} else {
					req.setAttribute("r", "�α��� ���� [��й�ȣ ����ġ]");
				}
			} else { // �����Ͱ� ���� ���
				req.setAttribute("r", "�α��� ���� [�������� �ʴ� ID]");

			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "�α��� ���� [���� ����]");
		}
		DBManager.close(con, pstmt, rs);
	}

	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if (m != null) {
			// �α��ο� ���� / ���� ��
			req.setAttribute("login", "loginSuccess.jsp");
			return true;
		}
		// �α��� ���°� �ƴϰų� ������ ���
		req.setAttribute("login", "login.jsp");
		return false;

	}

	public static void logout(HttpServletRequest req) {
//		req.getSession().setMaxInactiveInterval(-1); 	// �α����� �����ð��� -1�� �༭ ������ �������
		// �ٸ� ���ǵ� �� ����� �һ��
		// Member�� ���� Session�� null�� �ٲ��ֱ�
		req.getSession().setAttribute("loginMember", null);

	}

	// ȸ�� ���� ����
	public static void collectInfo(HttpServletRequest req) {
		String path = null;
		MultipartRequest mr = null;
		try {
			path = req.getServletContext().getRealPath("img");
			mr = new MultipartRequest(req, path, 10 * 1024 * 1024, 
					"EUC-KR", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "���� ���� ���� [�����뷮�� �ʹ� Ů�ϴ�.]");
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect("myPool");
			String pw = mr.getParameter("c_pw");
			String pN = mr.getParameter("c_phoneNum");
			String y = mr.getParameter("c_y");
			int m = Integer.parseInt(mr.getParameter("c_m"));
			int d = Integer.parseInt(mr.getParameter("c_d"));
			String bd = String.format("%s%02d%02d", y, m, d);
			String img = mr.getFilesystemName("c_picture");
			img = URLEncoder.encode(img, "EUC-KR").replace("+", " ");

			String sql = "update information set m_pw = ?, m_phoneNum = ?, "
					+ "m_bd = to_date(?, 'YYYYMMDD'), m_picture = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, pN);
			pstmt.setString(3, bd);
			pstmt.setString(4, img);
				

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "���� ���� �Ϸ�");
			} 
			// ������ �׸� �����ϵ��� �Ϸ��� ������ method�� ������־����
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "�����Ͻ� ������ �Է��� �ּ���.");
			return;
		}
		DBManager.close(con, pstmt, null);
	}

	// ���� ����
	public static void delete(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			String id = req.getParameter("c_id");
			String sql = "delete from information where m_id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "ȸ������ ���� �Ϸ�");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
