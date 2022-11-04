package com.project.movie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class Reservation {//예매정보 객체

	//	 private Person person; //예매한 고객을 ID로 분류하고 회원정보에서 찾아서 가져옴
	private int round; //영화의 회차 정보
	private JCheckBox[][] seats = new JCheckBox[7][10];  //예매한 좌석
	private static List<String> seatsNumber = new ArrayList<String>();
	public int Seatcheck = 0;
	public int Personcheck = 0;
	static String cho = "";
	
	
	
	Calendar now1 = Calendar.getInstance();




	public void Reserv(){
		JFrame resFrame = new JFrame();
		resFrame.setTitle("예매하기");
		resFrame.setSize(600,600);
		resFrame.setLocationRelativeTo(null);
		resFrame.setLayout(new FlowLayout());
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();
		JPanel row3_1 = new JPanel();
		JPanel row3_2 = new JPanel();
		JPanel row4 = new JPanel();
		JPanel row5 = new JPanel();
		JPanel row6 = new JPanel();
		JPanel row7 = new JPanel();
		resFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font1 = new Font("맑은고딕", Font.BOLD,20);
		Font seat = new Font("맑은고딕",Font.BOLD,10);
		Font colfont = new Font("맑은고딕", Font.PLAIN, 16);
		Font rowfont = new Font("맑은고딕", Font.BOLD, 12);

		//예매완료 버튼 생성
		JButton res = new JButton("예매완료");
		row6.add(res);

		//뒤로가기 버튼 생성
		JButton back = new JButton("뒤로가기");
		row7.add(back);


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
		JLabel curTime = new JLabel("선택한 회차");

		today.setPreferredSize(new Dimension(100,50));
		curMovie.setPreferredSize(new Dimension(180,50));
		curTime.setPreferredSize(new Dimension(120,50));

		//row1 폰트설정
		today.setFont(font1);
		curMovie.setFont(font1);
		curTime.setFont(font1);

		row1.add(today);
		row1.add(curMovie);
		row1.add(curTime);
		row1.setPreferredSize(new Dimension(500,80));


		//row3 사이즈 설정(좌석번호 1~10)
		row2.setPreferredSize(new Dimension(600,20));

		for (int i = 0; i < 10; i++) {
			JLabel seatRowLabel = new JLabel();
			String input =   "           " + Integer.toString(i + 1) ;
			seatRowLabel.setText(input);
			seatRowLabel.setFont(rowfont);
			row2.add(seatRowLabel);
		}
		//row3 사이즈 설정(좌석A~G +  체크박스)
		row3_1.setPreferredSize(new Dimension(20,240));
		JPanel col = new JPanel();

		for( int i = 0 ; i<7 ; i++) {
			JLabel seatColLabel = new JLabel();
			char input = (char)('A'+i);
			seatColLabel.setText(Character.toString(input));
			col.add(seatColLabel);
			seatColLabel.setFont(colfont);
		}
		col.setPreferredSize(new Dimension(20,240));
		col.setLayout(new GridLayout(7,0));
		row3_1.add(col);

		row3_2.setPreferredSize(new Dimension(450,250));
		row3_2.setLayout(new GridLayout(7,10));

		for(int i = 0 ; i< 7 ; i++) {
			for(int j = 0 ; j<10 ; j++) {
				JCheckBox box = new JCheckBox();
				seats[i][j] = box;
				char seatrow = (char)(i+65);
				String seatname = seatrow + Integer.toString(j+1);
				box.setText(seatname);
				box.setFont(seat);
				box.addItemListener(action);
				row3_2.add(box);
				
				//선택된 좌석이 중복하지 않도록 처리
				for(int s =0; s < seatsNumber.size(); s++) {
					if(seatname.equals(seatsNumber.get(s))) {
						box.setEnabled(false);
					}
				}
				
			}
		}


		res.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				new ReservationConfirm();
				resFrame.setVisible(false);

			}
		});
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//				List<String> copiedList = new ArrayList<>(seatsNumber);
				//				seatsNumber.add(cho)
				
				new TheaterMovieList();
				resFrame.setVisible(false);
				
			}
		});

		//인원수 선택
		ButtonGroup seatnum = new ButtonGroup();
		for( int i = 1 ; i<=10 ; i++) {
			JRadioButton ch = new JRadioButton(i+"명");
			seatnum.add(ch);
			ch.addActionListener(null);//인원수 선택
			row4.add(ch);
		}

		//선택한 좌석 출력

		row5.setPreferredSize(new Dimension(450,50));

		JLabel choice = new JLabel();
		choice.setFont(font1);
		choice.setText(cho);
		row5.add(choice);




		resFrame.add("North",row1);
		resFrame.add(row2);
		resFrame.add(row3_1);
		resFrame.add(row3_2);
		resFrame.add(row4);
		resFrame.add(row5);
		resFrame.add(row6);
		resFrame.add(row7);







		resFrame.setVisible(true);

	}
	//	class SeatActionListener implements ActionListener {
	//		
	//		@Override
	//		public void actionPerformed(ActionEvent e) {
	//			JCheckBox jbox = (JCheckBox)e.getSource();
	//				
	//				
	//			}
	//			
	//		}

	//예매완료 버튼 누르면 새 배열에 들어가게 설정



	ItemListener action = new ItemListener() {

		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox cb = (JCheckBox)e.getSource();

			if(e.getStateChange()==1) {
				seatsNumber.add(cb.getText());
				System.out.println(seatsNumber);
			}else {
				if(e.getStateChange()==0)
					while (seatsNumber.remove(String.valueOf(cb.getText()))) {
					};
					seatsNumber.remove(seatsNumber.indexOf(cb.getText()));
			}

			//isSelected가 체크박스가 체크되었는지 해제되었는지
			//확인해준다.

		}
	};


	//	public void mouseClicked(MouseEvent e) {
	//		if(e.getSource() == res )
	//	}


	public static void main(String[] args) {
		Reservation rv =new Reservation();
		rv.Reserv();

	}

}