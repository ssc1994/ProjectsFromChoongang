package com.health.exercise.model;

public class ExerciseVO {
	
	private int eno;
	private String ename;
	private int sets;
	private String econtent;
	private int base;
	private int rno;
	
	public ExerciseVO() {}
	
	public ExerciseVO(int eno, String ename, int sets, String econtent, int base, int rno) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sets = sets;
		this.econtent = econtent;
		this.base = base;
		this.rno = rno;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public String getEcontent() {
		return econtent;
	}
	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	

}
