package com.health.routine.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.health.util.UtilClose;

public class RoutineDAO {
	
	private static RoutineDAO instance = new RoutineDAO();
	
	public RoutineDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
		
	}
	
	public static RoutineDAO getInstance() {
		return instance;
	}
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.27:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public int getRoutine(int rno) {
		String sql ="select rno from routine where rno=?";
		 int result = 0;
		 
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, rno);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("rno");//db에서 가져온 값을 저장
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return result;//db값 반환
	}
	

}