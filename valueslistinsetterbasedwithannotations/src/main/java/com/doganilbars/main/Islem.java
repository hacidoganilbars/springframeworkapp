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
			System.out.println("Öğrenci Bilgileri");
			System.out.println("id: " + ogrenci.getId());
			System.out.println("isim: " + ogrenci.getIsim());
			System.out.println("puan: " + ogrenci.getPuan());
			System.out.println("Mail Listesi");
			for (String mail : ogrenci.getMailler()) {
				System.out.println("\t" + mail);
			}
			context.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
