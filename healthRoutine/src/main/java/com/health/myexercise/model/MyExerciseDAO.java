package com.health.myexercise.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import com.health.exercise.model.ExerciseVO;
import com.health.util.UtilClose;

public class MyExerciseDAO {
	
	private static MyExerciseDAO instance = new MyExerciseDAO(); 

	public MyExerciseDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
	}

	public static MyExerciseDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.27:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public ArrayList<MyExerciserVO> getdate(String id){
		ArrayList<MyExerciserVO> list = new ArrayList<>();
		
		String sql = "select * from exerciseinfo where id =?";
		try {
			conn = DriverManager.getConnection(URL,UID,UPW);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				MyExerciserVO vo = new MyExerciserVO();
				vo.setExeno1(rs.getInt("exeno1"));
				vo.setExeno2(rs.getInt("exeno2"));
				vo.setExeno3(rs.getInt("exeno3"));
				vo.setExeno4(rs.getInt("exeno4"));
				vo.setExeno5(rs.getInt("exeno5"));
				vo.setExeno6(rs.getInt("exeno6"));
				vo.setRno(rs.getInt("rno"));
				vo.setRdayno(rs.getInt("rdayno"));
				vo.setEdate(rs.getDate("edate"));
				vo.setId(rs.getString("id"));
				list.add(vo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	
	public ArrayList<MyExerciserVO> getExercise(MyExerciserVO vo){
		
		ArrayList<MyExerciserVO> list = new ArrayList<>();
		
		String sql="select  rnum, ename,sets,base,rdayno,rno\r\n"
				+ "    from(select rownum rnum,\r\n"
				+ "                ename,\r\n"
				+ "                sets,\r\n"
				+ "                base,\r\n"
				+ "                rdayno,\r\n"
				+ "                rno\r\n"
				+ "            from(select * from exercise where rno = ? and  rdayno = ?)\r\n"
				+ "            )\r\n"
				+ "where rnum =? or rnum = ? or rnum =? or rnum = ? or rnum =? or rnum =?";
		
		try {
			
			conn = DriverManager.getConnection(URL,UID,UPW);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo.getRno());
			pstmt.setInt(2, vo.getRdayno());
			pstmt.setInt(3, vo.getExeno1());
			pstmt.setInt(4, vo.getExeno2());
			pstmt.setInt(5, vo.getExeno3());
			pstmt.setInt(6, vo.getExeno4());
			pstmt.setInt(7, vo.getExeno5());
			pstmt.setInt(8, vo.getExeno6());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				MyExerciserVO vo2 = new MyExerciserVO();
				vo2.setEname(rs.getString("ename"));
				vo2.setSets(rs.getInt("sets"));
				vo2.setBase(rs.getInt("base"));
				vo2.setRdayno(rs.getInt("rdayno"));
				vo2.setRno(rs.getInt("rno"));
				
				list.add(vo2);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(conn, pstmt, rs);
		}
		
		
		
		return list;
		
		
	}

}
