package com.doganilbars.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doganilbars.entities.Ogrenci;

public class Islem {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");
			System.out.println("Öğrenci Bilgileri");
			System.out.println("id: " + ogrenci.getId());
			System.out.println("isim: " + ogrenci.getIsim());
			System.out.println("yaş: " + ogrenci.getYas());
			System.out.println("puan: " + ogrenci.getPuan());
			System.out.println("fakülte id: " + ogrenci.getFakulte().getId());
			System.out.println("fakülte adı: " + ogrenci.getFakulte().getIsim());
			context.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
