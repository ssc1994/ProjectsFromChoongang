package com.health.user.model;

public class UserVO {

	private int uno;
	private String name;
	private String id;
	private String pw;
	private int cm;
	private int kg;
	private String email;
	private int rno;
	
	public UserVO() {

	}

	public UserVO(int uno, String name, String id, String pw, int cm, int kg, String email, int rno) {
		super();
		this.uno = uno;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.cm = cm;
		this.kg = kg;
		this.email = email;
		this.rno = rno;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	
	
	
}
