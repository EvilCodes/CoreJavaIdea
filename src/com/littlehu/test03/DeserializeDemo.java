package com.littlehu.test03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e=null;
		
		
		try {
			FileInputStream fin=new FileInputStream("D:/tmp/employee.ser");
			ObjectInputStream ois=new ObjectInputStream(fin);
			e=(Employee) ois.readObject();
			fin.close();
			ois.close();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
			
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name:"+e.name);
		System.out.println("Address:"+e.address);
		System.out.println("SSN:"+e.SSN);
		System.out.println("Number:"+e.number);
		
	}

}
