package com.health.myexercise.model;

import java.util.ArrayList;

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
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.27:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public ArrayList<MyExerciserVO> getExercise(String ename, int sets, int base, int rno){
		ArrayList<MyExerciserVO> list = null;
		
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
