package project.dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO { //현재 로그인 멤버 구현
	
	
	private static String url = MainClass.url;	//주소
	private static String uid = MainClass.uid;	//계정
	private static String upw = MainClass.upw;	//비밀번호
	
	
	static Connection con = null;
	static PreparedStatement pstmt = null;
	private ResultSet result = null;
	public UserDAO() {
	}
	
	
	public int login(String memberID, String memberPassword) {
		String sql = "select pw from members where m_id = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberID);
			result = pstmt.executeQuery();
			while(result.next()) {
				if(result.getString(1).contentEquals(memberPassword)) {
					return 1; //비밀번호 일치, 로그인 성공
				} else {
					return 0; //비밀번호 불일치
				}
			}
			return -1; //아이디가 없음
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -2; //DB 오류
	}
	
	public MemberVO loginMember() {
		MemberVO currMember = new MemberVO();
		try {
			Scanner sc = new Scanner(System.in);
			UserDAO dao = new UserDAO();
			String memberID = sc.next();
			String memberPassword = sc.next();
			if(dao.login(memberID, memberPassword) == 1) {
				currMember.setName(memberID);
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currMember;
	}
	
}
