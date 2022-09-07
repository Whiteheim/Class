package com.sh.franc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sh.franc.Reserve.Reservation;
import com.sh.franc.Reserve.Resist;
import com.sh.sep06.DBManager.DBManager;

// DAO / DTO ����
//		MVC ����
//		DAO (Data Access Object)
//			: MVC�� M(model) �� DB���� �۾��� �����ϴ� Ŭ����
//		DTO (Data Transfer / Temp Object)
//			: DAO�� �۾������ ǥ���ϴ� Ŭ����

// java.utill.Date - �ַ�(Spring���� ���)
// java.sql.Date - ���� ��� (JDBC �̿�� ����)

// java.utill.Date -> java.sql.Date
//		: new Date(Ŭ������.get��¥���ø��������().getTime())

// java.sql.Date -> java.util.Date : �ڵ���ȯ��

public class DAO {
	// �����ϱ�
	public static String book(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();
			String sql = "insert into reservation " + "values(reservation_seq.nextval, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getWhen().getTime()));
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());

			if (pstmt.executeUpdate() == 1) {
				return "������ �Ϸ�Ǿ����ϴ�.";
			}
			return ""; // Java������ �ʿ��ؼ� ������ ����
		} catch (Exception e) {
			e.printStackTrace();
			return "������ �����߽��ϴ�.";
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	// ���� ���
	public static String resist(Resist res) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();
			String sql = "insert into franchise " + "values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, res.getLocation());
			pstmt.setString(2, res.getOwner());
			pstmt.setInt(3, res.getSeat());

			if (pstmt.executeUpdate() == 1) {
				return "���� ����� �Ϸ�Ǿ����ϴ�.";
			}
			return ""; // Java������ �ʿ��ؼ� ������ ����
		} catch (Exception e) {
			e.printStackTrace();
			return "���� ����� �����߽��ϴ�.";
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	// ���� Ȯ��
	public static ArrayList<Reservation> checkR() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBManager.connect();
			String sql = "select * from reservation order by r_time";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery(); // rs : select ���� ������ ���

			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();

			Reservation r = null;
			while (rs.next()) {
				r = new Reservation();
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getString("r_location"));
				rsvs.add(r);
			}
			return rsvs;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		return null;
	}

	public static ArrayList<Resist> checkStore() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();
			String sql = "select * from franchise order by f_location";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<Resist> alrs = new ArrayList<Resist>();

			Resist r = null;
			while (rs.next()) {
				r = new Resist();
				r.setLocation(rs.getString("r_location"));
				r.setOwner(rs.getString("r_owner"));
				r.setSeat(rs.getInt("r_seat"));
				alrs.add(r);
			}
			return alrs;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		return null;
	}

	// ���� ã��
	public static ArrayList<Resist> searchS(Resist srt) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();
			String sql = "select * from franchise where f_seat >= ?" + " order by f_seat";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, srt.getSeat());

			rs = pstmt.executeQuery();
			ArrayList<Resist> arrs = new ArrayList<Resist>();
//			Resist r = null;
//			while (rs.next()) {
//				r = new Resist();
//				r.setLocation(rs.getString("f_location"));
//				r.setOwner(rs.getString("f_owner"));
//				r.setSeat(rs.getInt("f_seat"));
//				arrs.add(r);
//			}

			while (rs.next()) {
				arrs.add(new Resist(rs.getString("f_location"), rs.getString("f_owner"), rs.getInt("f_seat")));
			}
			return arrs;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}
		return null;

	}

	public static ArrayList<Reservation> SearchReserve(String srs) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBManager.connect();
			String sql = "select * from reservation " + "where r_name like '%'||?||'%'";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, srs);

			rs = pstmt.executeQuery();
			ArrayList<Reservation> arsv = new ArrayList<Reservation>();
			Reservation r = null;

			while (rs.next()) {
				r = new Reservation();
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phone"));
				r.setLocation(rs.getString("r_location"));
				arsv.add(r);
			}
			return arsv;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		return null;
	}

	public static String cReserve(Reservation r) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBManager.connect();
			String sql = "update reservation set r_phone = '%'||?||'%'" + "where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, r.getPhone());
			pstmt.setInt(2, r.getNo());

			if (pstmt.executeUpdate() == 1) {
				return "���ຯ���� �Ϸ�Ǿ����ϴ�.";
			}

			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "���ຯ���� �����߽��ϴ�.\n �ٽ� Ȯ�����ּ���";
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

	public static String cancelR(Reservation r) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBManager.connect();
			String sql = "delete from reservation where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, r.getNo());

			if (pstmt.executeUpdate() == 1) {
				return "���� ��Ұ� �Ϸ�Ǿ����ϴ�.";
			}
			return "�������� �ʴ� ���������Դϴ�.";
		} catch (Exception e) {
			e.printStackTrace();
			return "���� ��Ұ� �����߽��ϴ�.";
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

}
