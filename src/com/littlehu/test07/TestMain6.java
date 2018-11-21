package com.littlehu.test07;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestMain6 {
	
	public static void main(String[] args) {
		try {
			Class stu=Class.forName(getValue("className"));
			Student student=(Student) stu.getConstructor().newInstance();
			Method  method=stu.getDeclaredMethod(getValue("methodName"), int.class);
			method.setAccessible(true);
			method.invoke(student,2);
			System.out.println(student.getHeight());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public  static String getValue(String key){
		Properties properties=new Properties();
		try {
			FileReader fileReader=new FileReader("resource/registerMsg.txt");
			properties.load(fileReader);
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
	}

}
