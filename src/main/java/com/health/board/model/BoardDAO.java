package com.health.board.model;

public class BoardDAO {

	private static BoardDAO instance = new BoardDAO(); 

	public BoardDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
		
	}

	public static BoardDAO getInstance() {
		return instance;
	}
	
	public String URL = "jdbc:oracle:thin:@172.30.1.5:1521:xe";
	public String UID = "health";
	public String UPW = "health";
	
	
}
