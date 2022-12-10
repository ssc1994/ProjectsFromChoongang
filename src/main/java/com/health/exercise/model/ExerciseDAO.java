package com.health.exercise.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.health.util.UtilClose;

public class ExerciseDAO {
	
	private static ExerciseDAO instance = new ExerciseDAO(); 

	public ExerciseDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
	}

	public static ExerciseDAO getInstance() {
		return instance;
	}
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.39:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ArrayList<ExerciseVO> getExercise(int rno){
		ArrayList<ExerciseVO> list = new ArrayList<>();
		
		String sql="select * from routine r left outer join exercise e on r.rno = e.rno where r.rno=?";
		
		try {
			conn=DriverManager.getConnection(URL, UID, UPW);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, rno);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String ename=rs.getString("ename");
				int sets=rs.getInt("sets");
				String econtent=rs.getString("econtent");
				int base = rs.getInt("base");
				int rno2 = rs.getInt("rno");
				int rdayno =rs.getInt("rdayno");
				int eno = rs.getInt("eno");
				ExerciseVO vo =new ExerciseVO(ename, sets, econtent, base, rno2, rdayno, eno);
				list.add(vo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		return list;
	}

}
