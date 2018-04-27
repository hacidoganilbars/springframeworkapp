package com.doganilbars.entities;

public class Kurs {

	private String id;
	private String isim;

	public Kurs() {
		super();
	}

	public Kurs(String id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
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

}
