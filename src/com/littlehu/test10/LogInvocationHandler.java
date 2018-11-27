package com.littlehu.test10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler{
	private Object object;
	public LogInvocationHandler(Object object) {
		this.object=object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		if ("getHobby".equals(methodName)|| "setName".equals(methodName)||"getAge".equals(methodName)) {
			System.out.println(methodName+"方法开始的时间"+System.currentTimeMillis());
			Object result = method.invoke(object, args);
			System.out.println(methodName+"方法结束的时间"+System.currentTimeMillis());
			return result;
		}
		return method.invoke(object, args);
	}

}
