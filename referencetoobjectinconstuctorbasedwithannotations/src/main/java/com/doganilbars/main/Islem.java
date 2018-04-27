package com.doganilbars.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.doganilbars.config.OgrenciConfig;
import com.doganilbars.entities.Ogrenci;

public class Islem {

	public static void main(String[] args) {
		try {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(OgrenciConfig.class);
			Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");
			System.out.println("Ogrenci Bilgileri");
			System.out.println("id: " + ogrenci.getId());
			System.out.println("isim: " + ogrenci.getIsim());
			System.out.println("yaş: " + ogrenci.getYas());
			System.out.println("puan: " + ogrenci.getPuan());
			System.out.println("Fakülte id: " + ogrenci.getFakulte().getId());
			System.out.println("fakülte adi: " + ogrenci.getFakulte().getIsim());
			context.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
