package com.project.movie;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheaterMovieList {
	TheaterMovieList() {
		JFrame jf2 = new JFrame();
		jf2.setTitle("상영관");
		
		jf2.setSize(600, 600);
//		jf2.setLayout(new FlowLayout());
		Dimension frameSize = jf2.getSize();

		//화면 중앙에 배치
		jf2.setLocationRelativeTo(null);
		
//		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
//		setLocation((windowSize.width - frameSize.width) / 2,
//				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(true);
		
		jf2.getContentPane().setLayout(null);
		
		JButton movie1 = new JButton("수수께끼! 꽃피는 천하떡잎학교");
		JButton movie2 = new JButton("자백");
		JButton movie3 = new JButton("고속도로 가족");
		JButton movie4 = new JButton("블랙 아담");
		JButton back = new JButton("뒤로가기");
		
		movie1.setBounds(50,50,210,30);
		movie2.setBounds(50,170,122,30);
		movie3.setBounds(50,290,122,30);
		movie4.setBounds(50,410,122,30);
		back.setBounds(450,490,122,30);
		
		
		//Container c = getContentPane();
		jf2.add(movie1);
		jf2.add(movie2);
		jf2.add(movie3);
		jf2.add(movie4);
		jf2.add(back);
		
		movie1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie1Time();
				jf2.setVisible(false);
			}
		});
		movie2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie2Time();
				jf2.setVisible(false);
			}
		});
		movie3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie3Time();
				jf2.setVisible(false);
			}
		});
		movie4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovie4Time();
				jf2.setVisible(false);
			}
		});
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Theater();
				jf2.setVisible(false);
			}
		});
		
		
	}
}