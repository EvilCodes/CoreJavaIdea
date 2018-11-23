package com.littlehu.test09;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+"synchronized loop"+i);
				
			}
		}
		
	}
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread ta=new Thread(t1,"A");
		Thread tb=new Thread(t1,"B");
		
		ta.start();
		tb.start();
	}
	
	

}
