package com.littlehu.test01;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
	public static void main(String[] args) {
		Properties capitals=new Properties();
		Set states;
		String str;
		
		
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		
		states = capitals.keySet();
		Iterator iterator = states.iterator();
		while (iterator.hasNext()) {
			str=(String) iterator.next();
			System.out.println("The capital of"+str+"is"+capitals.getProperty(str)+".");
			
			
		}
		System.out.println();
		str = capitals.getProperty("Florida","Not Found");
		System.out.println("The capital of Florida is"+str+".");
		
	}

}
