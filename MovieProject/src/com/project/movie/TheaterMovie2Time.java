package com.project.movie;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TheaterMovie2Time extends JFrame{
	TheaterMovie2Time() {
		setTitle("시간 선택");

		setSize(600, 600);
		setLayout(new FlowLayout());
		Dimension frameSize = getSize();

		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JButton movie2time1 = new JButton("19:40");
		JButton movie2time2 = new JButton("22:20");

		this.add(movie2time1);
		this.add(movie2time2);
	}
}
