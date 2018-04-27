package com.doganilbars.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.doganilbars.config.OgrenciConfig;
import com.doganilbars.entities.Kurs;
import com.doganilbars.entities.Ogrenci;

public class Islem {
	public static void main(String[] args) {

		try {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(OgrenciConfig.class);
			Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");

			System.out.println("Öğrenci bilgileri");
			System.out.println("id: " + ogrenci.getId());
			System.out.println("isim: " + ogrenci.getIsim());
			System.out.println("puan: " + ogrenci.getPuan());
			System.out.println("Kurs Listesi");
			System.out.println("===================================");
			for (Kurs kurs : ogrenci.getKurslar()) {
				System.out.println("Kurs id: " + kurs.getId());
				System.out.println("Kusr adı: " + kurs.getIsim());
				System.out.println("===================================");
			}
			context.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
