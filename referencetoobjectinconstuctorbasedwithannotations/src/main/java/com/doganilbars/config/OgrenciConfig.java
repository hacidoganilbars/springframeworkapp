package com.doganilbars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entities.Fakulte;
import com.doganilbars.entities.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "fakulteBean")
	public Fakulte fakulteBean() {
		return new Fakulte("555.edu", "Fen Edebiyat Fakültesi");
	}

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {
		return new Ogrenci("1578ogr", "Doğan İlbars", 30, 3.8, fakulteBean());
	}
}
