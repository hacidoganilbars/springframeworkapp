package com.doganilbars.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class OgrenciAfterMethod implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("OgrenciAfterMethod : After method " + method.getName());

	}

}
