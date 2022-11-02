package com.project.movie;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TheaterMovieList extends JFrame{
	TheaterMovieList() {
		setTitle("상영관");
		
		setSize(600, 600);
		setLayout(new FlowLayout());
		Dimension frameSize = getSize();

		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JButton movie1 = new JButton("수수께끼! 꽃피는 천하떡잎학교");
		JButton movie2 = new JButton("자백");
		JButton movie3 = new JButton("고속도로 가족");
		JButton movie4 = new JButton("블랙 아담");
		
		//Container c = getContentPane();
		this.add(movie1);
		this.add(movie2);
		this.add(movie3);
		this.add(movie4);
		
		movie1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie1Time();
				setVisible(false);
			}
		});
		movie2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie2Time();
				setVisible(false);
			}
		});
		movie3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie3Time();
				setVisible(false);
			}
		});
		movie4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie4Time();
				setVisible(false);
			}
		});
		
		
	}
}
