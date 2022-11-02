package com.project.movie;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Login {//회원가입한 고객 클래스
	Map<String,String> infoname = new HashMap<>();
	Map<String,String> infoage = new HashMap<>();
	Map<String,String> infopw = new HashMap<>();
	private String line;
	private String[] info;
	//값을 가져오기 위한 멤버변수. 
	private String InfoID;
	private String InfoName;
	private String InfoAge;



	//생성자-회원정보 저장
	public Login() {
		try {
			//아이디, 이름, 나이 저장된 파일에서 가져와서 map에 저장
			BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\login.txt"));
			while(true) {	
				this.line = bfr.readLine();
				if(line==null) break;
				this.info = this.line.split(" ");
				this.infopw.put(this.info[0], this.info[1]);
				this.infoname.put(this.info[0], this.info[2]);
				this.infoage.put(this.info[0], this.info[3]);
			}
			bfr.close();
			myLogin();
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	//로그인하기
	public void myLogin() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			//아이디 입력
			System.out.print("아이디 입력>");
			String myid = scan.next();
			//비밀번호 입력
			System.out.print("비밀번호 입력>");
			String mypword =scan.next();

			//저장된 정보와 다르면 다르다고 출력
			//비밀번호만 검사하는 방식으로.
			if(!mypword.equals(infopw.get(myid))) {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다");
				continue;
			}else {
				//맞으면 정보 저장
				System.out.println("로그인 성공");
				this.InfoID=myid;
				this.InfoName=infoname.get(myid);
				this.InfoAge=infoage.get(myid);
				break;
			}
		}
		scan.close();

	}






	//로그인에 성공하면 회원정보 읽어오기

	//key:아이디 
	public String getID() {
		return "아이디:" + InfoID;
	}

	//key:아이디 value:이름
	public String getname() {
		return "이름:"+InfoName;
	}

	//key:아이디 value:나이
	public String getage() {
		return "나이:"+InfoAge;
	}





}

