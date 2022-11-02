package com.project.movie;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Theater extends JFrame {//현재 상영중인 영화
	private Movie movie; //영화 정보
	private String TheaterLocation;
	private String Theater;
	private int round; //회차 정보
	private String start; //시작시간 
	private String finish; //끝시간
	private boolean reserve; //예매여부 
	

	//영화관 프레임 
	Theater() {
//		setSize(null);
		setTitle("영화관");// 타이틀
		setSize(600, 600);//창 크기 설정
		setLocation(200, 300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JPanel JPanel = new JPanel();
		JButton btn1 = new JButton("상영관");

		
		Dimension frameSize = getSize();

		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


		


		JButton screen1 = new JButton("구로");
		JButton screen2 = new JButton("동대문");
		JButton screen3 = new JButton("강남");
		JButton screen4 = new JButton("강변");
		JButton screen5 = new JButton("건대입구");
		
		
		
		c.add(screen1);
		c.add(screen2);
		c.add(screen3);
		c.add(screen4);
		c.add(screen5);
		
		screen1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});
		
		screen2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});
		
		screen3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});
		
		screen4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});
		screen5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});
		
		
		
		



	}





	public static void main(String[] args) {
		new Theater();

	}



}

