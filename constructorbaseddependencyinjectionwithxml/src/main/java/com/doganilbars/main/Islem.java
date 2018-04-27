package com.doganilbars.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doganilbars.comp.Fakulte;

public class Islem {
	public static void main(String[] args) {

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Fakulte fakulte = (Fakulte) context.getBean("fakulte");
			fakulte.showOgrenciInfo();
			context.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
