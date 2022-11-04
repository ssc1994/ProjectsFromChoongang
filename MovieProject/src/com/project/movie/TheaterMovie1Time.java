package com.project.movie;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TheaterMovie1Time extends JFrame {
	TheaterMovie1Time() {
		setTitle("시간 선택");

		setSize(600, 600);
		setLayout(new FlowLayout());
		Dimension frameSize = getSize();

		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JButton movie1time1 = new JButton("17:50");
		JButton movie1time2 = new JButton("20:00");
		JButton movie1time3 = new JButton("22:10");
		JButton back = new JButton("뒤로가기");

		this.add(movie1time1);
		this.add(movie1time2);
		this.add(movie1time3);
		this.add(back);

		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TheaterMovieList();
				setVisible(false);
			}
		});

	}
}
