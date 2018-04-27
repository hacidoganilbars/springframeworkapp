package com.doganilbars.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entity.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setId("ogr01");
		ogrenci.setIsim("Ogrenci 1");
		ogrenci.setYas(20);
		ogrenci.setPuan(3.5);
		return ogrenci;

	}
}
