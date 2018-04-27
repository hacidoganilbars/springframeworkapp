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
		List<String> mailler = new ArrayList<String>();
		mailler.add("hd.ilbars@hotmail.com");
		mailler.add("siyahulan_beyazulan@hotmail.com");
		mailler.add("dowill_01@hotmail.com");
		mailler.add("doganilbars80@gmail.com");

		return new Ogrenci("og8157", "Hacı Doğan İlbars", 4.0, mailler);

	}

}
