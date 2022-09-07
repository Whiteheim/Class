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

// DAO / DTO 패턴
//		MVC 패턴
//		DAO (Data Access Object)
//			: MVC의 M(model) 중 DB관련 작업을 전담하는 클래스
//		DTO (Data Transfer / Temp Object)
//			: DAO의 작업결과를 표현하는 클래스

// java.utill.Date - 주력(Spring에서 사용)
// java.sql.Date - 현재 사용 (JDBC 이용시 사용됨)

// java.utill.Date -> java.sql.Date
//		: new Date(클래스명.get날짜관련멤버변수명().getTime())

// java.sql.Date -> java.util.Date : 자동변환됨

public class DAO {
	// 예약하기
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
				return "예약이 완료되었습니다.";
			}
			return ""; // Java문법상 필요해서 억지로 넣음
		} catch (Exception e) {
			e.printStackTrace();
			return "예약이 실패했습니다.";
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	// 점포 등록
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
				return "점포 등록이 완료되었습니다.";
			}
			return ""; // Java문법상 필요해서 억지로 넣음
		} catch (Exception e) {
			e.printStackTrace();
			return "점포 등록이 실패했습니다.";
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	// 예약 확인
	public static ArrayList<Reservation> checkR() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBManager.connect();
			String sql = "select * from reservation order by r_time";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery(); // rs : select 문을 수행한 결과

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

	// 매장 찾기
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
				return "예약변경이 완료되었습니다.";
			}

			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "예약변경이 실패했습니다.\n 다시 확인해주세요";
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
				return "예약 취소가 완료되었습니다.";
			}
			return "존재하지 않는 예약정보입니다.";
		} catch (Exception e) {
			e.printStackTrace();
			return "예약 취소가 실패했습니다.";
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

}
