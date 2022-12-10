package com.health.exercisecalnedar.model;

import java.sql.Timestamp;

public class ExerciseCalendarVO {
	
	private int cno;
	private String id;
	private int echeck;
	private Timestamp edate;
	
	public ExerciseCalendarVO(int cno, String id, int echeck) {}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEcheck() {
		return echeck;
	}

	public void setEcheck(int echeck) {
		this.echeck = echeck;
	}
	
	
	
	
	
	

}
