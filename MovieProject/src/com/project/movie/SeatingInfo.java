package com.project.movie;

import java.util.ArrayList;

public class SeatingInfo {

	private ArrayList<SeatingInfoVO> SeatingInfo;

	public SeatingInfo() {
		SeatingInfo = new ArrayList<>();
	}
	
	public SeatingInfo(ArrayList<SeatingInfoVO> seatingInfo) {
		super();
		SeatingInfo = seatingInfo;
	}

	public ArrayList<SeatingInfoVO> getSeatingInfo() {
		return SeatingInfo;
	}

	public void setSeatingInfo(ArrayList<SeatingInfoVO> seatingInfo) {
		SeatingInfo = seatingInfo;
	}

	@Override
	public String toString() {
		return "SeatingInfo [SeatingInfo=" + SeatingInfo + "]";
	}
	
}
