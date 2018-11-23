package com.littlehu.test09;

public class Thread3 {
	public void m4t1(){
		synchronized (this) {
			int i=5;
			while(i-->0){
				System.out.println(Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep(500);
					
				} catch (Exception e) {
					
				}
				
			}
			
		}
	}
	
	public void m4t2(){
		synchronized (this) {
			int i=5;
			while(i-- >0){
				System.out.println(Thread.currentThread().getName()+":"+i);
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		final Thread3 myt3=new Thread3();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				myt3.m4t1();
				
			}
		},"A");
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				myt3.m4t2();
			}
		},"B");
		
		t1.start();
		t2.start();
		
	}

}
