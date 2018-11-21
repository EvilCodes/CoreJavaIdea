package com.littlehu.test08;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
	private String num;
	
	public MyCallable(String num) {
		this.num=num;
	}
	

	@Override
	public String call() throws Exception {
		System.out.println(">>>"+num+"任务启动");
		Date dateTmp1=new Date();
		Thread.sleep(1000);
		Date dateTmp2=new Date();
		
		long time=dateTmp2.getTime()-dateTmp1.getTime();
		System.out.println(">>>"+num+"任务终止");
		return num +"任务返回运行结果，当前任务时间【"+time+"毫秒】";
		
	}

	

}
