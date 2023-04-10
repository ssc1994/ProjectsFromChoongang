package com.health.info.model;

public class InfoVO {

	private int ino;
	private String ititle;
	private String icontent;
	private int uno;
	
	public InfoVO() {
	}

	public InfoVO(int ino, String ititle, String icontent, int uno) {
		super();
		this.ino = ino;
		this.ititle = ititle;
		this.icontent = icontent;
		this.uno = uno;
	}

	public int getIno() {
		return ino;
	}

	public void setIno(int ino) {
		this.ino = ino;
	}

	public String getItitle() {
		return ititle;
	}

	public void setItitle(String ititle) {
		this.ititle = ititle;
	}

	public String getIcontent() {
		return icontent;
	}

	public void setIcontent(String icontent) {
		this.icontent = icontent;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}
	
	
	
}
