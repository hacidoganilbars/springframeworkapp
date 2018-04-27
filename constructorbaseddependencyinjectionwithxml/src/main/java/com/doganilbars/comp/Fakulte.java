package com.doganilbars.comp;

import com.doganilbars.interfaces.IOgrenci;

public class Fakulte {

	private IOgrenci ogrenci;

	public Fakulte(IOgrenci ogrenci) {
		super();
		this.ogrenci = ogrenci;
	}

	public void showOgrenciInfo() {
		ogrenci.showOgrenciInfo();
	}

}
