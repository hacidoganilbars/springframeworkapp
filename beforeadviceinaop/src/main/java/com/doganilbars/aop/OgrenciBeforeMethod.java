package com.doganilbars.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class OgrenciBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("OgrenciBeforeMethod : Before method " + method.getName());

	}

}
