package com.project.movie;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class Reservation {//예매정보 객체

//	 private Person person; //예매한 고객을 ID로 분류하고 회원정보에서 찾아서 가져옴
	 private int round; //영화의 회차 정보
	 private String seat; //예매한 좌석
	 Calendar now1 = Calendar.getInstance();
	 
	 public Reservation(){
		 JFrame resFrame = new JFrame();
		 resFrame.setTitle("예매하기");
		 resFrame.setSize(500,600);
		 resFrame.setLocation(800,200);
		 resFrame.setLayout(new FlowLayout());
		 JPanel row1 = new JPanel();
		 JPanel row2 = new JPanel();
		 JPanel row3 = new JPanel();
		 JPanel row4 = new JPanel();
		 resFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Font font1 = new Font("배달의민족 도현", Font.BOLD,20);
		 Font seat = new Font("맑은고딕",Font.PLAIN,8);
		 
		 
		 //row1에 날짜 //영화명//회차(영화시간) 표시
		 JLabel year = new JLabel();
		 String t1 =now1.get(Calendar.YEAR) + " 년 " ;
		 year.setText(t1);
		 
		 JLabel month = new JLabel();
		 String t2 =(now1.get(Calendar.MONTH)+1) + " 월 " ;
		 month.setText(t2);
		 
		 JLabel day = new JLabel();
		 String t3 = now1.get(Calendar.DAY_OF_MONTH) + " 일";
		 day.setText(t3);
		 
		 JPanel today = new JPanel();
		 today.setLayout(new BoxLayout(today,BoxLayout.Y_AXIS));
		 today.add(year);
		 today.add(month);
		 today.add(day);
		 
		 JLabel curMovie = new JLabel("선택한 영화");
		 curMovie.setAlignmentX(Label.CENTER_ALIGNMENT);
		 JLabel curTime = new JLabel("선택한 회차");
		 curTime.setAlignmentX(Label.RIGHT);
		 
		 row1.add(today);
		 row1.add(curMovie);
		 curMovie.setBackground(Color.white);
		 row1.add(curTime);
		 
		 //row2에 좌석 표시
		 JButton A1 = new JButton("A1");
		 JButton A2 = new JButton("A2");
		 JButton A3 = new JButton("A3");
		 JButton A4 = new JButton("A4");
		 JButton A5 = new JButton("A5");
		 JButton A6 = new JButton("A6");
		 JButton A7 = new JButton("A7");
		 JButton A8 = new JButton("A8");
		 JButton A9 = new JButton("A9");
		 JButton A10 = new JButton("A10");
		 
		 JButton B1 = new JButton("B1");
		 JButton B2 = new JButton("B2");
		 JButton B3 = new JButton("B3");
		 JButton B4 = new JButton("B4");
		 JButton B5 = new JButton("B5");
		 JButton B6 = new JButton("B6");
		 JButton B7 = new JButton("B7");
		 JButton B8 = new JButton("B8");
		 JButton B9 = new JButton("B9");
		 JButton B10 = new JButton("B10");
		 
		 JButton C1 = new JButton("C1");
		 JButton C2 = new JButton("C2");
		 JButton C3 = new JButton("C3");
		 JButton C4 = new JButton("C4");
		 JButton C5 = new JButton("C5");
		 JButton C6 = new JButton("C6");
		 JButton C7 = new JButton("C7");
		 JButton C8 = new JButton("C8");
		 JButton C9 = new JButton("C9");
		 JButton C10 = new JButton("C10");
		 
		 JButton D1 = new JButton("D1");
		 JButton D2 = new JButton("D2");
		 JButton D3 = new JButton("D3");
		 JButton D4 = new JButton("D4");
		 JButton D5 = new JButton("D5");
		 JButton D6 = new JButton("D6");
		 JButton D7 = new JButton("D7");
		 JButton D8 = new JButton("D8");
		 JButton D9 = new JButton("D9");
		 JButton D10 = new JButton("D10");
		 
		 JButton E1 = new JButton("E1");
		 JButton E2 = new JButton("E2");
		 JButton E3 = new JButton("E3");
		 JButton E4 = new JButton("E4");
		 JButton E5 = new JButton("E5");
		 JButton E6 = new JButton("E6");
		 JButton E7 = new JButton("E7");
		 JButton E8 = new JButton("E8");
		 JButton E9 = new JButton("E9");
		 JButton E10 = new JButton("E10");
		 
		 JButton F1 = new JButton("F1");
		 JButton F2 = new JButton("F2");
		 JButton F3 = new JButton("F3");
		 JButton F4 = new JButton("F4");
		 JButton F5 = new JButton("F5");
		 JButton F6 = new JButton("F6");
		 JButton F7 = new JButton("F7");
		 JButton F8 = new JButton("F8");
		 JButton F9 = new JButton("F9");
		 JButton F10 = new JButton("F10");
		 
		 JButton G1 = new JButton("G1");
		 JButton G2 = new JButton("G2");
		 JButton G3 = new JButton("G3");
		 JButton G4 = new JButton("G4");
		 JButton G5 = new JButton("G5");
		 JButton G6 = new JButton("G6");
		 JButton G7 = new JButton("G7");
		 JButton G8 = new JButton("G8");
		 JButton G9 = new JButton("G9");
		 JButton G10 = new JButton("G10");
		 
		 
		 //row1 폰트설정
		 today.setFont(font1);
		 curMovie.setFont(font1);
		 curTime.setFont(font1);

		 
		 
		 resFrame.add(row1);
		 resFrame.add(row2);
		 resFrame.add(row3);
		 resFrame.add(row4);
		 
		 resFrame.setVisible(true);
		 
	 }
	 public static void main(String[] args) {
		new Reservation();
	}
}
