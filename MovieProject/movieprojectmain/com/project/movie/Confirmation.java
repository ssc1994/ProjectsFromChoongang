package com.project.movie;

import java.io.Serializable;

public class Confirmation {

	
	
	
}



class saveData implements Serializable {
	private String theaterLocation;
	private String movvieName;
	private String movieTime;
	private String seatInfo;
	
	
	public saveData() {
	}
	
	public String getTheaterLocation() {
		return theaterLocation;
	}

	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}

	public String getMovvieName() {
		return movvieName;
	}

	public void setMovvieName(String movvieName) {
		this.movvieName = movvieName;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getSeatInfo() {
		return seatInfo;
	}

	public void setSeatInfo(String seatInfo) {
		this.seatInfo = seatInfo;
	}
	
}