package com.health.exercisecalnedar.model;

import java.util.ArrayList;

import com.health.util.UtilClose;

public class ExerciseCalendarDAO {
	
	private static ExerciseCalendarDAO instance = new ExerciseCalendarDAO(); 

	public ExerciseCalendarDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
	}

	public static ExerciseCalendarDAO getInstance() {
		return instance;
	}
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public ArrayList<ExerciseCalendarVO> getExercise(String ename, int sets, int base, int rno){
		ArrayList<ExerciseCalendarVO> list = null;
		
		String sql="";
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(null, null, null);
		}
		
		
		
		return list;
		
		
	}

}
