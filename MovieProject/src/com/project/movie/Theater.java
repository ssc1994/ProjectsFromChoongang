package com.project.movie;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Theater {//현재 상영중인 영화
	private Movie movie; //영화 정보
	private int round; //회차 정보
	private String start; //시작시간 
	private String finish; //끝시간
	private boolean reserve; //예매여부 


	//영화관 프레임 
	Theater() {
		JFrame jf = new JFrame();
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();

		//		setSize(null);
		jf.setTitle("영화관");// 타이틀
		jf.setSize(600, 600);//창 크기 설정
		jf.setLocation(200, 300);
		Container c = jf.getContentPane();
		Container c2 = jf.getContentPane();
		//		c.setLayout(new FlowLayout());
		c2.add(row2, BorderLayout.SOUTH);


		// 화면 중앙에 띄우기
		jf.setLocationRelativeTo(null);

		Dimension frameSize = jf.getSize();

		//		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		//		jf.setLocation((windowSize.width - frameSize.width) / 2,
		//				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);




		jf.getContentPane().setLayout(null);

		JButton screen1 = new JButton("구로");
		JButton screen2 = new JButton("동대문");
		JButton screen3 = new JButton("강남");
		JButton screen4 = new JButton("강변");
		JButton screen5 = new JButton("건대입구");
		JButton back = new JButton("뒤로가기");

		screen1.setBounds(30,250,80,30);
		screen2.setBounds(140,250,80,30);
		screen3.setBounds(250,250,80,30);
		screen4.setBounds(360,250,80,30);
		screen5.setBounds(470,250,90,30);
		back.setBounds(450,490,122,30);

		jf.add(screen1);
		jf.add(screen2);
		jf.add(screen3);
		jf.add(screen4);
		jf.add(screen5);
		jf.add(back);

		screen1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});

		screen2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});

		screen3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});

		screen4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});
		screen5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				jf.setVisible(false);
			}
		});
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////////////////뒤로가기 나중에 변경해줘야함////////////////////
				new Theater();
				jf.setVisible(false);
			}
		});







	}





	public static void main(String[] args) {
		new Theater();

	}



}