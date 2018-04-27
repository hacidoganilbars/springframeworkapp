package com.doganilbars.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doganilbars.interfaces.Ogretmen;

@Component
public class Fakulte {

	private Ogretmen ogretmen;

	@Autowired
	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void showOgretmenInfo() {
		ogretmen.showOgretmenInfo();
	}

}
