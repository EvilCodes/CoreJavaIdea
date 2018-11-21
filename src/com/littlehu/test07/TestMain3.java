package com.littlehu.test07;

import java.lang.reflect.Field;

public class TestMain3 {
	public static void main(String[] args) {
		
		try {
			Class stuClass=Class.forName("com.littlehu.test07.Student");
			//获取公有的属性
			Field[] fields = stuClass.getFields();
			Student stu = (Student) stuClass.newInstance();
			for (Field field : fields) {
				field.setAccessible(true);
				field.set(stu, 55);
				System.out.println(stu.getHeight());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
