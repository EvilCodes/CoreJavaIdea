package com.littlehu.test07;

import java.lang.reflect.Method;

public class TestMain2 {
	public static void main(String[] args) {
		try {
			Class stu = Class.forName("com.littlehu.test07.Student");
			System.out.println(stu.getName());
			Method method = stu.getMethod("setName", String.class);
//			Student stu2=(Student) stu.newInstance();
			Student stu2=new Student();
			method.setAccessible(true);
			method.invoke(stu2, "ะกร๗");
			System.out.println(stu2.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
