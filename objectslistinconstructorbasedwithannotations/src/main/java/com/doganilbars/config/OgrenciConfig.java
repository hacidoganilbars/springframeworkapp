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
		List<Kurs> kurslar = new ArrayList<Kurs>();
		kurslar.add(new Kurs("j101", "Java Kursu"));
		kurslar.add(new Kurs("c202", "C# Kursu"));
		kurslar.add(new Kurs("a404", "Android Kursu"));
		return new Ogrenci("8", "Hacı Doğan İlbars", 5.0, kurslar);
	}

}
