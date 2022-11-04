package com.project.movie;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservationConfirm {
	
	public ReservationConfirm() {
		
		JFrame resComfirm = new JFrame();
		resComfirm.setTitle("예매 확인");
		resComfirm.setSize(600, 600);
		resComfirm.setLocationRelativeTo(null);
		resComfirm.getContentPane().setLayout(null);
		resComfirm.setVisible(true);
		
		JLabel theaterConfirm = new JLabel("지점: ");
		JLabel movieConfirm = new JLabel("영화: ");
		JLabel timeConfirm = new JLabel("상영시간: ");
		JLabel seatConfirm = new JLabel("좌석: ");
		
		theaterConfirm.setBounds(50,50,210,30);
		movieConfirm.setBounds(50,170,122,30);
		timeConfirm.setBounds(50,290,122,30);
		seatConfirm.setBounds(50,410,122,30);
		
		resComfirm.add(theaterConfirm);
		resComfirm.add(movieConfirm);
		resComfirm.add(timeConfirm);
		resComfirm.add(seatConfirm);
	}
	
	public static void main(String[] args) {
		
		new ReservationConfirm();
		
	}

}
