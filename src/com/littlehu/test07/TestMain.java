package com.littlehu.test07;

public class TestMain {
	public static void main(String[] args) {
		Student stu=new Student();
		
		Class stu1 = stu.getClass();
		
		Class stu2=Student.class;
		
		try {
			Class stu3 = Class.forName("com.littlehu.test07.Student");
			System.out.println(stu1==stu2);
			System.out.println(stu1==stu3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
