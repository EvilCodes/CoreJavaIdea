package com.littlehu.test08;

public class TestMain {
	public static void main(String[] args) {
		NewThread newThread=new NewThread();
		Thread thread=new Thread(newThread);
		thread.start();
		
	}

}
