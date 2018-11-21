package com.littlehu.test07;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestMain7 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("¿œ≤Ã");
		list.add("¿œ¬¨");
		
		try {
			Method method=list.getClass().getDeclaredMethod("add", Object.class);
			method.setAccessible(true);
			method.invoke(list, 1000);
			for (Object value : list) {
				System.out.println(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
