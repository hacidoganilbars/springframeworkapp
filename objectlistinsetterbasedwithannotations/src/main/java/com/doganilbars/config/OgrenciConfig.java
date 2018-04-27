package com.doganilbars.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.entities.Kurs;
import com.doganilbars.entities.Ogrenci;

@Configuration
public class OgrenciConfig {

	@Bean(name = "ogrenciBean")
	public Ogrenci ogrenciBean() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setId("157ogr");
		ogrenci.setIsim("Hacı Doğan İlbars");
		ogrenci.setPuan(4.5);
		List<Kurs> kurslar = new ArrayList<Kurs>();
		kurslar.add(new Kurs("j1", "Java Kursu"));
		kurslar.add(new Kurs("c4", "C# Kursu"));
		kurslar.add(new Kurs("a5", "Android Kursu"));
		ogrenci.setKurslar(kurslar);
		return ogrenci;

	}

}
