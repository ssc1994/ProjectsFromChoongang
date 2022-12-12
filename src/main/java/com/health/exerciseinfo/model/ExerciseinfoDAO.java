package com.health.exerciseinfo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.health.exercise.model.ExerciseVO;
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
	
	public ArrayList<ExerciseVO> getRoutine(){
		ArrayList<ExerciseVO> list = new ArrayList<>();
		
		String sql = "select * from exercise where rno =3 and rday= 1";
		
		try {
			conn = DriverManager.getConnection(URL,UID,UPW);
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ExerciseVO vo = new ExerciseVO();
				vo.setEname(rs.getString("ename"));
				vo.setSets(rs.getInt("sets"));
				vo.setBase(rs.getInt("base"));
				
				list.add(vo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		return list;
	}
	

}
