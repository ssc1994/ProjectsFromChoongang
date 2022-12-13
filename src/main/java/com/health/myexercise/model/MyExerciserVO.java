package com.health.myexercise.model;

import java.sql.Date;

public class MyExerciserVO {
	
	private String id;
	private String ename;
	private int rno;
	private int sets;
	private int base;
	private int rdayno;
	private int exeno1;
	private int exeno2;
	private int exeno3;
	private int exeno4;
	private int exeno5;
	private int exeno6;
	private Date edate;
	
	
	
	
	public MyExerciserVO() {}

	public MyExerciserVO(String id,String ename, int rno, int rdayno, int exeno1, int exeno2, int exeno3, int exeno4, int exeno5,
			int exeno6, Date edate) {
		super();
		this.id = id;
		this.ename = ename;
		this.rno = rno;
		this.sets= sets;
		this.base=base;
		this.rdayno = rdayno;
		this.exeno1 = exeno1;
		this.exeno2 = exeno2;
		this.exeno3 = exeno3;
		this.exeno4 = exeno4;
		this.exeno5 = exeno5;
		this.exeno6 = exeno6;
		this.edate = edate;
	}
	
	

	public int getSets() {
		return sets;
	}
	
	public void setSets(int sets) {
		this.sets = sets;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getRdayno() {
		return rdayno;
	}

	public void setRdayno(int rdayno) {
		this.rdayno = rdayno;
	}

	public int getExeno1() {
		return exeno1;
	}

	public void setExeno1(int exeno1) {
		this.exeno1 = exeno1;
	}

	public int getExeno2() {
		return exeno2;
	}

	public void setExeno2(int exeno2) {
		this.exeno2 = exeno2;
	}

	public int getExeno3() {
		return exeno3;
	}

	public void setExeno3(int exeno3) {
		this.exeno3 = exeno3;
	}

	public int getExeno4() {
		return exeno4;
	}

	public void setExeno4(int exeno4) {
		this.exeno4 = exeno4;
	}

	public int getExeno5() {
		return exeno5;
	}

	public void setExeno5(int exeno5) {
		this.exeno5 = exeno5;
	}

	public int getExeno6() {
		return exeno6;
	}

	public void setExeno6(int exeno6) {
		this.exeno6 = exeno6;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}
	
	
	
	
	
	
	
	
	

}
