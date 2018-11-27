package com.littlehu.test10;

public class DaoImpl implements Dao{
	private Student stu;
	
	public DaoImpl() {
	}
	public DaoImpl(Student stu) {
		this.stu=stu;
	}

	@Override
	public int getAge() {
		System.out.println("������:"+stu.getAge());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return stu.getAge();
	}

	@Override
	public String getHobby() {
		System.out.println("������:"+stu.getHobby());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return stu.getHobby();
	}

	@Override
	public void setName(String name) {
		stu.setName(name);
		
	}

}
