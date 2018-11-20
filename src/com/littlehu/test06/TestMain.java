package com.littlehu.test06;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain {
	
	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newSingleThreadExecutor();
		Future<Integer> future = threadPool.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int a=new Random().nextInt(20);
				System.out.println("��ȡ���Ľ���ǣ�"+a);
				return a;
			}
		});
		try {
			Thread.sleep(5000);
			System.out.println("�õ����������ǣ�"+future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
