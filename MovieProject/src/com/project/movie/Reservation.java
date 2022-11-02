package com.project.movie;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class Reservation {//예매정보 객체
//	 private Person person; //예매한 고객을 ID로 분류하고 회원정보에서 찾아서 가져옴
	 private int round; //영화의 회차 정보
	 
	 
	 private JCheckBox[][] seats = new JCheckBox[7][10];  //예매한 좌석
	  
	 
	 
	 
	 Calendar now1 = Calendar.getInstance();
	 
	 public Reservation(){
		 JFrame resFrame = new JFrame();
		 resFrame.setTitle("예매하기");
		 resFrame.setSize(600,600);
		 resFrame.setLocationRelativeTo(null);
		 resFrame.setLayout(new FlowLayout());
		 JPanel row1 = new JPanel();
		 JPanel row2 = new JPanel();
		 JPanel row3 = new JPanel();
		 JPanel row4 = new JPanel();
		 resFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Font font1 = new Font("배달의민족 도현", Font.BOLD,20);
		 Font seat = new Font("맑은고딕",Font.BOLD,10);
		 
		 
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
		 
		 today.setPreferredSize(new Dimension(100,50));
		 curMovie.setPreferredSize(new Dimension(180,50));
		 curMovie.setAlignmentX(Label.CENTER_ALIGNMENT);
		 curTime.setPreferredSize(new Dimension(120,50));
		 curTime.setAlignmentX(Label.RIGHT_ALIGNMENT);
		 
		 
		 row1.add(today);
		 row1.add(curMovie);
		 curMovie.setBackground(Color.white);
		 row1.add(curTime);
		 row1.setPreferredSize(new Dimension(500,100));
		 
		 
		 row2.setPreferredSize(new Dimension(500,20));
		 
		 //row2에 좌석열 표시
		 for (int i = 0; i < 10; i++) {
				JLabel seatRowLabel = new JLabel();
				String input = Integer.toString(i + 1) + "     ";
				seatRowLabel.setText(input);
				seatRowLabel.setBounds(61 + (i * 22), 55, 22, 15);
				seatRowLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 14));
				row2.add(seatRowLabel);
			}
		 
		 row3.setPreferredSize(new Dimension(500,400));
		 
		 
		 
		 for(int i = 0 ; i< 7	;	i++) {
			 for(int j = 0 ; j<10 ; j++) {
				 JCheckBox box = new JCheckBox();
				 seats[i][j] = box;
				 char seatrow = (char)(i+65);
				 box.setText(seatrow+" " + Integer.toString(j+1));
				 box.setFont(seat);
				 row3.add(box);
			 }
		 }
		 
		 
		
		
		 
		 //row1 폰트설정
		 today.setFont(font1);
		 curMovie.setFont(font1);
		 curTime.setFont(font1);
		 
		 
		 
		 resFrame.add("North",row1);
		 resFrame.add(row2);
		 resFrame.add(row3);
		 resFrame.add(row4);
		 
		 resFrame.setVisible(true);
		 
	 }
	 public static void main(String[] args) {
		new Reservation();
	}
}
