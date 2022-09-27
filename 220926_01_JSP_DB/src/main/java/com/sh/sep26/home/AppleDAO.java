package com.sh.sep26.home;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import com.sh.sep26.manager.DBManager;

public class AppleDAO {
	
	private int allAppleCount; // ��ü ��� ���� �������
	
	private static final AppleDAO APPLEDAO = new AppleDAO();
	
	private AppleDAO() {
		// TODO Auto-generated constructor stub
	}

	public static AppleDAO getAppledao() {
		return APPLEDAO;
	}
	
	// ��� ����� ������ �� ��������
	public void getAllApples(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			//sql�� �ۼ�
			String sql = "select * from sep26_apple order by a_price";
			
			pstmt = con.prepareStatement(sql);
			
			// C / U / D : pstmt.executeUpdate() �� ����
			// 		=> �����Ͱ� �� �� ������ �޾Ҵ����� ���� ��Ÿ��
			// R : pstmt.executeQuery()�� ����
			//		=> select����� ResultSet���� ���� ���
			
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			// �� �迭 �����ؼ� Query���� ���� �� ���� ������ �޾ƿ�
			// arrylist�� �ϳ��� ä���ֱ�
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apples.add(apple);
			}
			req.setAttribute("apples", apples);
		} catch(Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, rs);
	}
	
	public void insertApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect("myPool");
			
			req.setCharacterEncoding("EUC-KR");
			String location = req.getParameter("location");			
			String name = req.getParameter("name");			
			String color = req.getParameter("color");			
			int price = Integer.parseInt(req.getParameter("price"));			
			String flavor = req.getParameter("flavor");
			
			// <textArea>���� �ٹٲ� : \r\n
			// ������������ �ٹٲ� : <br>
			
			// sql�� (�̿ϼ�) : ����ڸ��� ���� ��
			String sql = "insert into sep26_apple values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			pstmt.setString(2, name);
			pstmt.setString(3, color);
			pstmt.setInt(4, price);
			pstmt.setString(5, flavor);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[��ϼ���]");
				allAppleCount++;
			} 
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[��Ͻ���]");
		}
		DBManager.close(con, pstmt, null);
	}
	
	// �� �����Ͱ� �� �� ����
	public void countApples() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			String sql="select count(*) from sep26_apple";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next(); // executeQuery �Ŀ� ���� �����ͷ� �Ѿ��
			
			// ������ ������ ������ ���
			allAppleCount = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, rs);
	}
	
	
	// DB�� �뷮�� ������ ���� -> �ش� ������ ��ȣ�� �´� �����͸� ��������
	public void getApples(int pageNo, HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			// SQL�� �����ϴµ� �ʿ��� �� ì���
			
			// allAppleCount : ��ü ��� ������ ��
			int applePerPage = 4; // �� �������� ������ ��� �������� ��
			
			// ������ ���� �������� (������� �Ҽ������� ���´ٸ�
			//	�ø�ó�� �Ͽ� ������ ���� ������ �� �ֵ��� ����)
			// Math.ceil : ���� �ø�
			int pageCount = (int) Math.ceil(allAppleCount / (double) applePerPage);
			req.setAttribute("pageCount", pageCount);
			///////////////////////////////////////////////////////////////////
			int start = (applePerPage * (pageNo - 1)) + 1;
			int end = (pageNo == pageCount) ? allAppleCount : (start + applePerPage - 1);
			
			String sql = "select * from ( " 
					+ 		"select rownum as rn, a_location, a_color, a_flavor, a_price, a_name "
					+ 		"from ( "
					+ 				"select * "
					+ 				"from sep26_apple "
					+ 				"order by a_price "
					+ 			") "
					+ 		") "
					+ 	"where rn >= ? and rn <= ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				apples.add(apple);
				
			}
			req.setAttribute("apples", apples);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		DBManager.close(con, pstmt, rs);
	}
	
	// �� ���� ��������(primary key �̿�)
	// �����͸� ����� �������� true, ���������� false
	public boolean getAppleDetail(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBManager.connect("myPool");
			
			String location = req.getParameter("a_location"); // �����ص� primary key �� ��������
			// ���̺�� / �÷��� / SQL ��Ÿ ����
			String sql = "select * from sep26_apple where a_location = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location); // ? �ڸ� ä���ֱ�
			rs = pstmt.executeQuery(); // resultSet�� ��� ���
			
			if (rs.next()) { // �����Ͱ� ���� �Ѵٸ�
				Apple apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_name(rs.getString("a_name"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apple.setA_flavor(rs.getString("a_flavor"));
				req.setAttribute("apple", apple); // �ҷ��� ���� attribute�� ���
				return true;// �Ϲ����� ��Ȳ : �����Ͱ� �ϳ�
 			}
			return false;	// �������� ��Ȳ : �ٸ������ �����͸� ������ ��� (�����Ͱ� ����)
		} catch (Exception e) {
			e.printStackTrace();
			return false;	// DB���� ���°� ������ ��� (ex : ������ ������ ����)
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
	}
	
	public void deleteApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			String location = req.getParameter("a_location");
			String sql = "delete from sep26_apple where a_location = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			
			if (pstmt.executeUpdate() == 1) { // ���� �� �� 1�̶�� 
				req.setAttribute("r", "[���� ����]");
				allAppleCount--;
			} else {
				req.setAttribute("r", "[���� ����]");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBManager.close(con, pstmt, null);
	}
	
	public boolean update(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBManager.connect("myPool");
			
			req.setCharacterEncoding("EUC-KR");
			
			String location = req.getParameter("a_location");
			String name = req.getParameter("a_name");
			String color = req.getParameter("a_color");
			int price = Integer.parseInt(req.getParameter("a_price"));
			String flavor = req.getParameter("a_flavor");
			
			String sql = "update sep26_apple "
					+ "set a_color=?, a_name=?, a_price=?, a_flavor=? "
					+ "where a_location=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, color);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setString(4, flavor);
			pstmt.setString(5, location);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "[���� �Ϸ�]");
				return true;
			} else {
				req.setAttribute("r", "[���� ����]");
				return false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "[���� ����]");
			return false;
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






























