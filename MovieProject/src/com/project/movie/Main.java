package com.project.movie;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		DateFormat sdFormat = new SimpleDateFormat("HH:mm");
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date now = new Date();
		String movie1time1_ = "17:50";
		String time1 = "";
		String tempDate = sdFormat.format(now);
		try {
			Date movie1_time1 = dateFormat.parse(movie1time1_);
			time1 = sdFormat.format(movie1_time1);
			
			if(now.getTime() < movie1_time1.getTime()) {
				JOptionPane.showMessageDialog(null, "이미 상영이 시작한 영화입니다!");
			} else {
				new TheaterMovieList();
//				jf2.setVisible(false);
			}
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		System.out.println(time1);
		System.out.println(tempDate);
		System.out.println();
		if(sdFormat.format(time1).compareTo(tempDate)>0)
			System.out.println("<");
			
		else if(sdFormat.format(time1).compareTo(tempDate)<0) {
			System.out.println(">");
			
		}else if(sdFormat.format(time1).compareTo(tempDate)==0)
			System.out.println("=");
		
		;

		
		
		
		
		


	}

}
