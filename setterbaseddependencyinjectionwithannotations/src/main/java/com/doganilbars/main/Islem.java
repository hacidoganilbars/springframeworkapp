package com.doganilbars.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.doganilbars.comp.Fakulte;
import com.doganilbars.config.AppConfig;

public class Islem {
	public static void main(String[] args) {

		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			Fakulte fakulte = context.getBean(Fakulte.class);
			fakulte.showOgretmenInfo();
			context.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
