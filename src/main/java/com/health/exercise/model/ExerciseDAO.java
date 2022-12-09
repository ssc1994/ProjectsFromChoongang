package com.health.exercise.model;

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
	
	public static final String URL = "jdbc:oracle:thin:@172.30.1.5:1521:xe";
	public static final String UID = "health";
	public static final String UPW = "health";

}
