package com.project.movie;

public class SeatingInfoVO{

	private String seatNum;

	public SeatingInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeatingInfoVO(String seatNum) {
		super();
		this.seatNum = seatNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {
		return "SeatingInfoVO [seatNum=" + seatNum + "]";
	}
	
}
