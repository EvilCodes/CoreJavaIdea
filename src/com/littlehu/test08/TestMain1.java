package com.littlehu.test08;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain1 {
	public static void main(String[] args) {
		System.out.println("-------程序运行--------");
		Date date=new Date();
		int taskSize=5;
		
		ExecutorService pool=Executors.newFixedThreadPool(taskSize);
		Future f;
		
		List<Future> list =new ArrayList<>();
		for (int i = 0; i < taskSize; i++) {
			Callable a=new MyCallable(i+"");
			f=pool.submit(a);
			list.add(f);
		}
		
		pool.shutdown();
		for (Future future : list) {
			try {
				System.out.println(future.get().toString());
			} catch (Exception e) {
				e.printStackTrace();
			} 	
		}
		Date date2=new Date();
		System.out.println("-----程序结束运行-----，程序运行时间【"+(date2.getTime()-date.getTime())+"毫秒】");
	}
}
