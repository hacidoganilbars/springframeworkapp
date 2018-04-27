package com.doganilbars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.doganilbars.impl.OgretmenImpl;
import com.doganilbars.interfaces.Ogretmen;

@Configuration
@ComponentScan(basePackages = "com.doganilbars.comp")
public class AppConfig {

	@Bean
	public Ogretmen getOgretmen() {
		return new OgretmenImpl();
	}

}
