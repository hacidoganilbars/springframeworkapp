package com.doganilbars.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entities.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setId("157.ogr");
		ogrenci.setIsim("Hacı Doğan İlbars");
		ogrenci.setPuan(5.0);
		List<String> mailler = new ArrayList<String>();
		mailler.add("hd.ilbars@hotmail.com");
		mailler.add("doganilbars80@gmail.com");
		mailler.add("siyahulan_beayzulan@hotmail.com");
		mailler.add("dowill_01@hotmail.com");
		ogrenci.setMailler(mailler);
		return ogrenci;
	}

}
