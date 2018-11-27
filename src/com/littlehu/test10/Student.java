package com.littlehu.test10;

public class Student {
	
	private String hobby;
	private int age;
	private String name;
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [hobby=" + hobby + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	

}
