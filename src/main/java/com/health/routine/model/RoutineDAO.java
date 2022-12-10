package com.health.routine.model;


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
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.5:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";
	
	public int getRoutine(int idno) {
		
		int result = 0;
		String sql ="";
		
		try {
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			UtilClose.close(null, null, null);
		}
		
		
		
		return result;
	}
	

}
