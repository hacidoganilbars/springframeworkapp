package com.doganilbars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.impl.OgrenciImpl;
import com.doganilbars.interfaces.Ogrenci;

@Configuration
@ComponentScan(basePackages = "com.doganilbars.comp")
public class AppConfig {

	@Bean
	public Ogrenci getOgrenci() {
		return new OgrenciImpl();
	}

}
