package com.littlehu.test07;

import java.lang.reflect.Method;

public class TestMain4 {
	public static void main(String[] args) {
		try {
			Class stu=Class.forName("com.littlehu.test07.Student");
			Method method=stu.getDeclaredMethod("setName", String.class);
			Student student=(Student) stu.getConstructor().newInstance();
			method.setAccessible(true);
			method.invoke(student, "ะกร๗");
			System.out.println(student.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
