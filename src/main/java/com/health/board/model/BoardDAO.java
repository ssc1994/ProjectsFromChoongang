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
	public String URL = "jdbc:oracle:thin:@172.30.1.27:1521:xe";
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
		String sql = "SELECT * FROM board WHERE bno=? ";
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
	
	public void hit(String bno) {
		String sql = "UPDATE board set hit=hit+1 where bno =?";
		try {
			conn = DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
	}
	
	
	public ArrayList<BoardVO> getList(){
		
		ArrayList<BoardVO> list =  new ArrayList<>();
		
		//String sql = "SELECT * FROM board where bno<50 and bno>43 ORDER BY bno DESC";
		String sq2 = "select * from (select rownum rn, b.* from(select * from board order by bno desc) b )where rn <=5";
			
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt=conn.prepareStatement(sq2);
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
	 
	public void modify(String bno, String btitle, String bcontent) {
		int result = 0;
		String sql = "UPDATE BOARD SET btitle =? , bcontent =? WHERE bno =?";
		try {
			conn= DriverManager.getConnection(URL, UID, UPW);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bno);
			pstmt.executeUpdate();
		} catch (Exception e) {
		
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
	}
	
	public int delete(String bno) {
		int result=0;
		 String sql = "delete from board where bno = ?";
	      try {
	         conn = DriverManager.getConnection(URL,UID,UPW);         
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, bno);
	         
	         result = pstmt.executeUpdate();
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      finally {
	         UtilClose.close(conn, pstmt, rs);
	      }
		return result;
	}
	
	public ArrayList<BoardVO> search(String search) {

		ArrayList<BoardVO> list = new ArrayList<>();

		String sql = "select * from board where btitle like ?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(URL,UID,UPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+search+"%");
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
	
	public int getTotal() {
		int result = 0;
		String sql = "select count(*) as total from board";
		
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
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
	
//	public ArrayList<BoardVO> getList1(int pageNum, int amount){
//		ArrayList<BoardVO> list = new ArrayList<>();
//		String sql = "select * "
//				+ 	 "from (select rownum rn,"
//				+ 				   " a.* "
//				+ 			"from (select *"
//				+ 				 " from board order by bno desc) a ) "
//				+ 	 "where rn > ? and rn <= ?";
//		try {
//			conn=DriverManager.getConnection(URL, UID, UPW);			
//			pstmt = conn.prepareStatement(sql); // sql준비
//			pstmt.setInt(1, (pageNum - 1) * amount);
//			pstmt.setInt(2, pageNum * amount);
//			rs = pstmt.executeQuery(); // sql문 실행
//			
//			while(rs.next()) {
//				// 한바퀴 회전당 VO를 하나씩 생성
//				int bno2 = rs.getInt("bno");
//				String btitle = rs.getString("btitle");
//				String bcontent = rs.getString("bcontent");
//				Timestamp regdate = rs.getTimestamp("regdate");
//				int hit = rs.getInt("hit");
//				String bid = rs.getString("bid");
//				BoardVO vo = new BoardVO(bno2, btitle, bcontent, regdate, hit, bid);
//				list.add(vo);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			UtilClose.close(conn, pstmt, rs);
//		}
//		return list;
//	}
}
