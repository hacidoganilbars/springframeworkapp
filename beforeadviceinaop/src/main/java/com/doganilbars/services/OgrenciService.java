package com.doganilbars.services;

public class OgrenciService {
	
	private String isim;
	
	private double puan;

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void setPuan(double puan) {
		this.puan = puan;
	}
	
	public void printIsim() {
		System.out.println("Öğrenci Adı: "+this.isim);
	}
	
	public void printPuan() {
		System.out.println("Öğrenci Puanı: "+this.puan);
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	

}
