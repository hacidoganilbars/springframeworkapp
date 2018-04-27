package com.doganilbars.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class OgrenciAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Metod adı: " + methodInvocation.getMethod());
		System.out.println("Metod argümanları: " + Arrays.toString(methodInvocation.getArguments()));
		System.out.println("OgrenciAroundMethod : Before method Ogrenci!");

		try {
			Object result = methodInvocation.proceed();
			System.out.println("OgrenciAroundMethod : Before after Ogrenci!");
			return result;

		} catch (Exception e) {
			System.err.println("OgrenciAroundMethod : Throw exception Ogrenci!");
			throw e;
		}
	}

}
