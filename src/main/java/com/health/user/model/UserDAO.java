package com.health.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	private static UserDAO instance = new UserDAO();
	
	private UserDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("드라이버 클래스 로드 에러");
		}
	}

	public static UserDAO getInstance() {
		
		return instance;
	}

	public String URL = "jdbc:oracle:thin:@172.30.1.5:1521:xe";
	public String UID = "health";
	public String UPW = "health";
	
	
	
	
	
	
	
	
}
