package com.littlehu.test07;

import java.lang.reflect.Method;

public class TestMain5 {
	public static void main(String[] args) {
		try {
			Class stu=Class.forName("com.littlehu.test07.Student");
			Method method=stu.getDeclaredMethod("main", String[].class);
//			Student student=(Student) stu.getConstructor().newInstance();
//			method.setAccessible(true);
			method.invoke(null, (Object)new String[]{"a","b","c"});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
