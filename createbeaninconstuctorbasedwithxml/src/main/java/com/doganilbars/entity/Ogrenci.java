package com.doganilbars.entity;

public class Ogrenci {

	private String id;
	private String isim;
	private int yas;
	private double puan;

	public Ogrenci() {
		super();
	}

	public Ogrenci(String id, String isim, int yas, double puan) {
		super();
		this.id = id;
		this.isim = isim;
		this.yas = yas;
		this.puan = puan;
	}

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

}
