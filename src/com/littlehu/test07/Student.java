package com.littlehu.test07;

public class Student {
	
	public static void main(String[] args) {
		System.out.println("main方法执行了");
	}
	private String name;
	private int age;
	private String gender;
	public int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + "]";
	}
	
	
	

}
