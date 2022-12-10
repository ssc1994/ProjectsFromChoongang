package com.health.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.health.util.UtilClose;

public class BoardDAO {

	private static BoardDAO instance = new BoardDAO(); 

	public BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
	}

	public static BoardDAO getInstance() {
		return instance;
	}
	
	//사용할 변수들 미리 생성
	public String URL = "jdbc:oracle:thin:@172.30.1.39:1521:xe";
	public String UID = "health";
	public String UPW = "health";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void write(String writer, String title, String content) {
		String sql="INSERT INTO board (bno, btitle, bcontent, bid) VALUES (board_seq.nextval, ? , ?,  ?)";
		try {
			
			conn = DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
	}
	
	public BoardVO getContent(String bno) {
		String sql = "SELECT * FROM board WHERE bno=?";
		BoardVO vo = null;
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int bno2 = rs.getInt("bno");
				String title = rs.getString("btitle");
				String content = rs.getString("bcontent");
				Timestamp date = rs.getTimestamp("regdate");
				int hit = rs.getInt("hit");
				String id = rs.getString("bid");
				vo = new BoardVO(bno2, title, content, date, hit, id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return vo;
	}
	
	public ArrayList<BoardVO> getList(){
		
		ArrayList<BoardVO> list =  new ArrayList<>();
		
		String sql = "SELECT * FROM board ORDER BY bno DESC";
			
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bno2 = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp regdate = rs.getTimestamp("regdate");
				int hit = rs.getInt("hit");
				String bid = rs.getString("bid");
				BoardVO vo = new BoardVO(bno2, btitle, bcontent, regdate, hit, bid);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return list;
	}
	
	
	
}
