package com.doganilbars.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doganilbars.entity.Ogrenci;

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
			context.close();
		} catch (Exception e) {

			System.err.println(e.getMessage());

		}

	}

}
