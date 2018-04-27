package com.doganilbars.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doganilbars.interfaces.Ogrenci;

@Component
public class Fakulte {

	private Ogrenci ogrenci;

	@Autowired
	public Fakulte(Ogrenci ogrenci) {
		super();
		this.ogrenci = ogrenci;
	}

	public void showOgrenciInfo() {
		ogrenci.showOgrenciInfo();
	}

}
