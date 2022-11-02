package com.project.movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class SignInClass {
	private String Name; //사용자 이름
	private String Age; //나이
	private String Id; //아이디
	private String Pw; //비밀번호


	public SignInClass() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setId() {
		try {
			//아이디 기록파일에 입력하기
			PrintStream signup = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\login.txt",true));
			//아이디 입력받기
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.print("아이디를 입력하세요>");
				String id = scan.next();
				String idlower=id.toLowerCase();
				//아이디 검사하고 올바른 형식인지 확인하기
				if(!idlower.matches("^[0-9a-z]*$")) {
					System.out.println("아이디는 영어와 숫자로만 생성 가능합니다");
					continue;
				}
					
				
				//아이디 중복검사하기
				//기존에 있는 아이디 가져오기
				BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\login.txt"));
				String line = bfr.readLine();
				String eid = line.split(" ")[0];
				String eidlower=eid.toLowerCase();
				//기존에 있는 아이디를 소문자로 변환한 것과 새로 입력한 아이디를 소문자로 변환한 것을 비교하기
				
				if(idlower.equals(eidlower)) {
					System.out.println("이미 존재하는 아이디입니다.");
					continue;
				}else{
					System.out.println("아이디 생성이 가능합니다!");
					this.Id=id;
					signup.print(this.Id+"\s");
					signup.flush();
					signup.close();
					bfr.close();
					break;
				}
			}

			//비밀번호 등록창으로 넘어가기
			if(this.Id!=null) {
				setPw();
			}

			scan.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}



	public void setPw() {
		try {

			//비밀번호 기록파일에 입력하기
			PrintStream signup = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\login.txt",true));
			//비밀번호 입력받기
			Scanner scan = new Scanner(System.in);
			String pwordtemp="";
			while(true) {
				System.out.print("비밀번호를 입력하세요>");
				//만약 확인 과정에서 틀려서 다시 만들고 싶을 때 기존에 입력한 첫번째 비밀번호 초기화
				pwordtemp="";
				String pword = scan.next();
				int countCapital=0;

				for(int i=0;i<pword.length();i++) {
					if(pword.charAt(i)>=65&&pword.charAt(i)<=90) {
						countCapital++;
					}
					if(countCapital>=1) {
						break;
					}
				}

				//길이 제한
				if(pword.length()<10) {
					System.out.println("비밀번호는 10글자 이상입니다");
					continue;
				}else if(countCapital==0) {
					//대문자 하나 포함
					System.out.println("비밀번호는 대문자가 하나 이상 포함되어야 합니다");
					continue;
				}else if(!pword.matches("^[0-9a-zA-Z]*$")) {
					System.out.println("비밀번호는 영어와 숫자로만 생성 가능합니다");
				}else {
					System.out.println("올바른 형식의 비밀번호입니다");
					pwordtemp=pword;
					break;
				}
			}
				
				//비밀번호 확인
				while(true) {
					System.out.print("비밀번호를 확인해주세요>");
					String pword2=scan.next();
					
					if(!pword2.equals(pwordtemp)) {
						System.out.println("입력한 비밀번호와 다릅니다");
						continue;
					}else {
						System.out.println("비밀번호 생성이 가능합니다!");
						this.Pw=pwordtemp;
						signup.print(this.Pw+"\s");
						signup.flush();
						signup.close();
						break;
					}
				}
				
				//비밀번호까지 입력했으면 이름과 나이 입력하기
				if(this.Pw!=null) {
					setNameAge();
				}
				
				scan.close();
				
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
	}
		
	public void setNameAge() {
		
		//이름과 나이 기록파일에 입력하기
		try {
			PrintStream signup = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\login.txt",true));
			Scanner scan = new Scanner(System.in);
			//이름 넣기
			while(true) {
				System.out.print("이름을 입력하세요>");
				String name = scan.next();
				//이름 검사하고 올바른 형식인지 확인하기
				if(!name.matches("^[0-9a-zA-Z가-힣]*$")) {
					System.out.println("이름의 형식이 잘못되었습니다");
					continue;
				}
				else{
					this.Name=name;
					signup.print(this.Name+"\s");
					signup.flush();
					signup.close();
					break;
				}
			}
			
			if(this.Name!=null){
				//나이 입력하기
				while(true) {
					System.out.print("나이를 입력하세요>");
					String age = scan.next();
					//나이 검사하고 올바른 형식인지 확인하기
					if(!age.matches("^[0-9]*$")||Integer.parseInt(age)<=0||Integer.parseInt(age)>=300) {
						System.out.println("나이의 형식이 잘못되었습니다");
						continue;
					}else{
						this.Age=age;
						signup.print(this.Age+"\n");
						System.out.println("회원가입이 완료되었습니다");
						signup.flush();
						signup.close();
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
