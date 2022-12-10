package com.health.exerciseinfo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.39:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public void ExInsert(String exeno1,String exeno2,String exeno3,String exeno4,String exeno5,String exeno6,String id,String routine) {
	
		String sql = "";
		
		try {
			conn = DriverManager.getConnection(URL, UID, UPW);
			pstmt = conn.prepareStatement(sql);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
	}
	

}
