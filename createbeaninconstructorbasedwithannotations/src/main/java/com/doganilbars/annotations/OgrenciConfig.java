package com.doganilbars.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entity.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {

		return new Ogrenci("157ogr", "Doğan İlbars", 29, 4.75);
	}
}
