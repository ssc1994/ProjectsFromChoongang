package com.health.info.model;

public class InfoDAO {

	private static InfoDAO instance = new InfoDAO();
	
	public InfoDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.err.println("드라이버 클래스 로드 에러");
		}
	}

	public static InfoDAO getInstance() {
		return instance;
	}

	public String URL = "jdbc:oracle:thin:@172.30.1.5:1521:xe";
	public String UID = "health";
	public String UPW = "health";
	
}
