package com.littlehu.test10;

import java.lang.reflect.Proxy;

public class TestMain {
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.setAge(26);
		stu.setHobby("д����");
		stu.setName("С��");
		Dao dao=new DaoImpl(stu);
		Dao proxyDao = (Dao) Proxy.newProxyInstance(LogInvocationHandler.class.getClassLoader(), new Class<?>[]{Dao.class}, new LogInvocationHandler(dao));
		proxyDao.getHobby();
		System.out.println("---------�ָ���-----------");
		proxyDao.getAge();
	}

}
