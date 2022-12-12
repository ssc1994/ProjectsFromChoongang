package com.health.exerciseinfo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.health.exercise.model.ExerciseVO;
import com.health.user.model.UserVO;
import com.health.util.UtilClose;

public class ExerciseinfoDAO {
	
	private static ExerciseinfoDAO instance = new ExerciseinfoDAO();

	public ExerciseinfoDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
	}

	public static ExerciseinfoDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.27:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public ArrayList<ExerciseVO> getRoutine(int rno ,int rdayno){
		ArrayList<ExerciseVO> list = new ArrayList<>();
		
		String sql = "select * from exercise where rno =? and rdayno= ?";
		try {
			conn = DriverManager.getConnection(URL,UID,UPW);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, rno);
			pstmt.setInt(2, rdayno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ExerciseVO vo = new ExerciseVO();
				vo.setEname(rs.getString("ename"));
				vo.setSets(rs.getInt("sets"));
				vo.setBase(rs.getInt("base"));
				vo.setRno(rs.getInt("rno"));
				vo.setRdayno(rs.getInt("rdayno"));
				
				
				list.add(vo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	public void insert(String id, int rno , int exeno1, int exeno2, int exeno3,int exeno4,int exeno5,int exeno6,int rdayno) {
		
		String sql = "insert into exerciseinfo values(uno_seq.NEXTVAL,?,?,?,?,?,?,?,?,sysdate,?)";
		
		try {
			conn = DriverManager.getConnection(URL,UID,UPW);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,id);
			pstmt.setInt(2, exeno1);
			pstmt.setInt(3, exeno2);
			pstmt.setInt(4, exeno3);
			pstmt.setInt(5, exeno4);
			pstmt.setInt(6, exeno5);
			pstmt.setInt(7, exeno6);
			pstmt.setInt(8, rno);
			pstmt.setInt(9, rdayno);
			
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
	}
		
		
		
		
		

}
