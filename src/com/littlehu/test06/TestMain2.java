package com.littlehu.test06;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain2 {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		
		CompletionService<Integer> cs=new ExecutorCompletionService<Integer>(threadPool);
		for (int i = 0; i < 5; i++) {
			final int taskId=i;
			cs.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					System.out.println("输入参数是："+taskId);
					return taskId;
				}
			});
		}
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(cs.take().get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
		}
	}
}
