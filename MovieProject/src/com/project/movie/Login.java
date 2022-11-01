package com.project.movie;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
public class Login {//회원가입한 고객 클래스
	Map<String,String> infoname = new HashMap<>();
	Map<String,String> infoage = new HashMap<>();
	private String line;
	private String[] info;
	private String InfoID;
	private String InfoName;
	private String InfoAge;
	
	
	
	
	
	
	
	
	
	
	
	
	//생성자-회원정보 저장
	public Login() {
		try {
			//아이디, 이름, 나이 map에 저장
			BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\login.txt"));
			while(true) {	
				line = bfr.readLine();
				if(line==null) break;
				info = line.split(" ");
				infoname.put(info[0], info[2]);
				infoage.put(info[0], info[3]);
			}
			bfr.close();
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}


	//회원정보 읽어오기
	
		//key:아이디 value:이름
		public String getID() {
			this.InfoID=line.split(" ")[0];
			return InfoID;
		}
	
		//key:아이디 value:이름
		public String getinfoname() {
			this.InfoName=infoname.get(line.split(" ")[0]);
			return InfoName;
		}
		
		//key:아이디 value:나이
		public String getinfoage() {
			this.InfoAge=infoage.get(line.split(" ")[0]);
			return InfoAge;
		}


		
		
		
}

