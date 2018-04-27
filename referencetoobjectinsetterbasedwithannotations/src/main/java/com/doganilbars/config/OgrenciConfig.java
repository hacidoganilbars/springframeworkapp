package com.doganilbars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entities.Fakulte;
import com.doganilbars.entities.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "fakulteBean")
	public Fakulte fakulteBean() {
		return new Fakulte("edu123", "İşletme Fakültesi");
	}

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setId("8ogr");
		ogrenci.setIsim("Doğan İlbars");
		ogrenci.setYas(25);
		ogrenci.setPuan(4.75);
		ogrenci.setFakulte(fakulteBean());
		return ogrenci;

	}
}
