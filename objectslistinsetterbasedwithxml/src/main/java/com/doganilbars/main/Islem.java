package com.doganilbars.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doganilbars.entities.Kurs;
import com.doganilbars.entities.Ogrenci;

public class Islem {
	public static void main(String[] args) {

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");

			System.out.println("Öğrenci Bilgileri");
			System.out.println("id: " + ogrenci.getId());
			System.out.println("isim: " + ogrenci.getIsim());
			System.out.println("puan: " + ogrenci.getPuan());
			System.out.println("Kurs Listesi");
			System.out.println("===================================");
			for (Kurs kurs : ogrenci.getKurslar()) {
				System.out.println("Kurs id: " + kurs.getId());
				System.out.println("Kurs ismi: " + kurs.getIsim());
				System.out.println("===================================");
			}
			context.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
