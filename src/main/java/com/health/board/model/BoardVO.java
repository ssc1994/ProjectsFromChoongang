package com.health.board.model;

import java.security.Timestamp;

public class BoardVO {

	private int bno;
	private String btitle;
	private String bcontent;
	private Timestamp regdate;
	private int hit;
	private int uno;
	
	public BoardVO() {
	}
	public BoardVO(int bno, String btitle, String bcontent, Timestamp regdate, int hit, int uno) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.regdate = regdate;
		this.hit = hit;
		this.uno = uno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	
	
	
}
