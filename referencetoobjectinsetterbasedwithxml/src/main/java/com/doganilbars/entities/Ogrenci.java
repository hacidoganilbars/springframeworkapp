package com.doganilbars.entities;

public class Ogrenci {
	private String id;
	private String isim;
	private int yas;
	private double puan;
	private Fakulte fakulte;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public double getPuan() {
		return puan;
	}
	public void setPuan(double puan) {
		this.puan = puan;
	}
	public Fakulte getFakulte() {
		return fakulte;
	}
	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}
	
	

}
