package com.doganilbars.entities;

import java.util.List;

public class Ogrenci {
	private String id;
	private String isim;
	private double puan;
	private List<Kurs> kurslar;

	public Ogrenci() {
		super();
	}

	public Ogrenci(String id, String isim, double puan, List<Kurs> kurslar) {
		super();
		this.id = id;
		this.isim = isim;
		this.puan = puan;
		this.kurslar = kurslar;
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

	public List<Kurs> getKurslar() {
		return kurslar;
	}

	public void setKurslar(List<Kurs> kurslar) {
		this.kurslar = kurslar;
	}

}
