package com.doganilbars.service;

public class OgrenciService {

	private String isim;
	private double puan;

	public void printIsim() {
		System.out.println("Öğrenci İsmi: " + this.isim);
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void printPuan() {
		System.out.println("Öğrenci Puan: " + this.puan);
	}

	public void setPuan(double puan) {
		this.puan = puan;
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}
