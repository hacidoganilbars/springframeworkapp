package com.doganilbars.aop;

import org.springframework.aop.ThrowsAdvice;

public class OgrenciThrowException implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {

		System.out.println("OgrenciThrowException : Throw exception " + e.getMessage());

	}

}
