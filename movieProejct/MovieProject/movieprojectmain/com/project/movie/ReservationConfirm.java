package com.project.movie;

import java.awt.FlowLayout;
import java.awt.Label;

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
      JPanel theaterConfirm = new JPanel();
      JPanel movieConfirm = new JPanel();
      JPanel timeConfirm = new JPanel();
      JPanel seatConfirm = new JPanel();
      
      JLabel theater = new JLabel("지점: ");
      JLabel movie = new JLabel("영화: ");
      JLabel time = new JLabel("상영시간: ");
      JLabel seat = new JLabel("좌석: ");
      
      JLabel theaterInfo = new JLabel(Theater.locData.getTheaterLocation());
      JLabel movieInfo = new JLabel(Theater.locData.getMovvieName());
      JLabel timeInfo = new JLabel(Theater.locData.getMovieTime());
      JLabel seatInfo = new JLabel(Reservation.seatsNumber.toString());
      
      theaterConfirm.add(theater);
      theaterConfirm.add(theaterInfo);
      movieConfirm.add(movie);
      movieConfirm.add(movieInfo);
      timeConfirm.add(time);
      timeConfirm.add(timeInfo);
      seatConfirm.add(seat);
      seatConfirm.add(seatInfo);
      
      theaterConfirm.setBounds(30,50,500,30);
      movieConfirm.setBounds(30,170,500,30);
      timeConfirm.setBounds(30,290,500,30);
      seatConfirm.setBounds(30,410,500,30);
      
      
      
      resComfirm.add(theaterConfirm);
      resComfirm.add(movieConfirm);
      resComfirm.add(timeConfirm);
      resComfirm.add(seatConfirm);
      resComfirm.setVisible(true);
   }
   
   public static void main(String[] args) {
      
      new ReservationConfirm();
      
   }

}