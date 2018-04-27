package com.doganilbars.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doganilbars.services.OgrenciService;

public class Islem {

	public static void main(String[] args) {

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			OgrenciService ogrenciService = (OgrenciService) context.getBean("ogrenciServiceProxy");
			ogrenciService.printIsim();
			System.out.println("===================================");
			ogrenciService.printPuan();
			System.out.println("===================================");
			ogrenciService.printThrowException();
			context.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
