package com.project.movie;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TheaterMovie4Time extends JFrame {
	TheaterMovie4Time() {
		setTitle("시간 선택");

		setSize(600, 600);
		setLayout(new FlowLayout());
		Dimension frameSize = getSize();

		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JButton movie4time1 = new JButton("10:40");
		JButton movie4time2 = new JButton("13:20");
		JButton movie4time3 = new JButton("15:50");
		JButton movie4time4 = new JButton("18:50");
		JButton movie4time5 = new JButton("21:20");
		JButton movie4time6 = new JButton("23:50");

		this.add(movie4time1);
		this.add(movie4time2);
		this.add(movie4time3);
		this.add(movie4time4);
		this.add(movie4time5);
		this.add(movie4time6);
	}
}

