package com.project.movie;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Theater {//현재 상영중인 영화


	//예약정보저장 객체 (공용)
	public static saveData locData = new saveData();

	Theater() {
		//프레임 선언
		JFrame jf = new JFrame();
		jf.setTitle("영화관");// 창 타이틀
		jf.setSize(600, 600);//창 크기 설정

		//폰트 설정
		Font font1 = new Font("맑은고딕", Font.BOLD, 20);


		// 화면 중앙에 띄우기
		jf.setLocationRelativeTo(null);
		// x버튼 누르면 종료되게 설정
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// 위치 각자 설정하기 위해 써줌
		jf.getContentPane().setLayout(null);

		//영화관 버튼 선언
		JButton screen1 = new JButton("구로");
		JButton screen2 = new JButton("동대문");
		JButton screen3 = new JButton("강남");
		JButton screen4 = new JButton("강변");
		JButton screen5 = new JButton("건대입구");
		JButton back = new JButton("뒤로가기");


		//버튼 테두리 삭제
		screen1.setFocusable(false);
		screen2.setFocusable(false);
		screen3.setFocusable(false);
		screen4.setFocusable(false);
		screen5.setFocusable(false);
		back.setFocusable(false);

		//영화관 버튼 위치 설정
		screen1.setBounds(30,250,80,30);
		screen2.setBounds(140,250,80,30);
		screen3.setBounds(250,250,80,30);
		screen4.setBounds(360,250,80,30);
		screen5.setBounds(470,250,90,30);
		back.setBounds(450,490,122,30);

		//영화관 버튼 삽입
		jf.add(screen1);
		jf.add(screen2);
		jf.add(screen3);
		jf.add(screen4);
		jf.add(screen5);
		//뒤로가기 버튼 삽입
		jf.add(back);

		//클릭했을 때 영화리스트 클래스로 이동
		screen1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				locData.setTheaterLocation("구로"); 

				new TheaterMovieList();

				//창전환 설정
				jf.setVisible(false);
			}
		});

		screen2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				locData.setTheaterLocation("동대문");
				new TheaterMovieList();

				jf.setVisible(false);
			}
		});

		screen3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				locData.setTheaterLocation("강남");
				new TheaterMovieList();

				jf.setVisible(false);
			}
		});

		screen4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				locData.setTheaterLocation("강변");
				new TheaterMovieList();

				jf.setVisible(false);
			}
		});
		screen5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				locData.setTheaterLocation("건대입구");
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});

		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Select();
				jf.setVisible(false);
			}
		});


	}


	public static void main(String[] args) {
		new Theater();

	}	
}