package com.doganilbars.entities;

import java.util.List;

public class Ogrenci {

	private String id;
	private String isim;
	private double puan;

	private List<String> mailler;

	public Ogrenci() {
		super();
	}

	public Ogrenci(String id, String isim, double puan, List<String> mailler) {
		super();
		this.id = id;
		this.isim = isim;
		this.puan = puan;
		this.mailler = mailler;
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

	public double getPuan() {
		return puan;
	}

	public void setPuan(double puan) {
		this.puan = puan;
	}

	public List<String> getMailler() {
		return mailler;
	}

	public void setMailler(List<String> mailler) {
		this.mailler = mailler;
	}

}
