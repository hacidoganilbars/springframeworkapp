package com.doganilbars.comp;

import com.doganilbars.interfaces.IOgretmen;

public class Fakulte {

	private IOgretmen ogretmen;

	public IOgretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(IOgretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public void showOgretmenInfo() {
		ogretmen.showOgretmenInfo();
	}

}
