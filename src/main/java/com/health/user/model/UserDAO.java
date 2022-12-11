package com.health.user.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.health.util.UtilClose;

public class UserDAO {

	private static UserDAO instance = new UserDAO();
	
	private UserDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
	}

	public static UserDAO getInstance() {
		
		return instance;
	}

	public String URL = "jdbc:oracle:thin:@172.30.1.12:1521:xe";
	public String UID = "health";
	public String UPW = "health";
	
	public void join(UserVO vo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "insert into users(uno, name, id, pw, cm, kg, email, rno) values (uno_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setInt(4, vo.getCm());
			pstmt.setInt(5, vo.getKg());
			pstmt.setString(6, vo.getEmail());
			pstmt.setInt(7, vo.getRno());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
	}
	
	public int idCheck(String id, String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int result = 0;
		String sql = "select count(*) as total from users where id = ? or email = ?";
		
		try {
			// 1.conn 객체
			conn = DriverManager.getConnection(URL, UID, UPW);
			// 2.pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, email);
			
			//3.실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("total");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public UserVO login(String id, String pw) {
		
		UserVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from users where id = ? and pw = ?";
		
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String id2 = rs.getString("id");
				int cm = rs.getInt("cm");
				int kg = rs.getInt("kg");
				String email = rs.getString("email");
				int rno = rs.getInt("rno");
				
				vo = new UserVO(0, name, id2, null, cm, kg, email, rno);
						
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		
		return vo;
	}
	
	public UserVO getInfo(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		UserVO vo = null;
		
		String sql = "select * from users where id = ?";
		
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String id2 = rs.getString("id");
				String pw = rs.getString("pw");
				int cm = rs.getInt("cm");
				int kg = rs.getInt("kg");
				String email = rs.getString("email");
				int rno = rs.getInt("rno");
				
				vo = new UserVO(0, name, id2, pw, cm, kg, email, rno);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	public int update(String pw, int cm, int kg, String email, int rno, String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int result = 0;
		
		String sql = "update users set pw = ?, cm = ?, kg = ?, email = ?, rno = ? where id = ?";
		
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setInt(2, cm);
			pstmt.setInt(3, kg);
			pstmt.setString(4, email);
			pstmt.setInt(5, rno);
			pstmt.setString(6, id);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		
		return result;
	}
	
	public int delete(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int result = 0;

		String sql = "delete from users where id = ?";
		
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
}
