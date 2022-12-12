package com.health.exerciseinfo.model;

import java.sql.Timestamp;

public class ExerciseinfoVO {
	
	public ExerciseinfoVO() {}
	
	private int uno;
	private int echeck;
	private int exeno1;
	private int exeno2;
	private int exeno3;
	private int exeno4;
	private int exeno5;
	private int exeno6;
	private int rno;
	private int rdayno;
	private Timestamp exdate;
	
	
	public ExerciseinfoVO(int uno, int echeck, int exeno1, int exeno2, int exeno3, int exeno4, int exeno5,
			int exeno6, int rno, int rdayno, Timestamp exdate) {}


	public int getUno() {
		return uno;
	}


	public void setUno(int uno) {
		this.uno = uno;
	}


	public int getEcheck() {
		return echeck;
	}


	public void setEcheck(int echeck) {
		this.echeck = echeck;
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


	public Timestamp getExdate() {
		return exdate;
	}


	public void setExdate(Timestamp exdate) {
		this.exdate = exdate;
	}
	
	
	
	
	
	
	

}
