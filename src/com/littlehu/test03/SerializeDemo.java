package com.littlehu.test03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Reyan Ali";
		e.address="Phokka Kuan, Ambehta Peer";
		e.SSN=11122333;
		e.number=101;
		
		try {
			FileOutputStream fos=new FileOutputStream("D:/tmp/employee.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
	}

}
