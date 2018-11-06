package com.littlehu.test01;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("stack:"+st);
		
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		
		
		showpop(st);
		showpop(st);
		showpop(st);
		
		
		try {
			showpop(st);
			
		} catch (Exception e) {
			System.out.println("empty stack");
		}
		
		
	}
	
	
	static void showpush(Stack st,int a){
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("stack:"+st);
		
	}
	
	static void showpop(Stack st){
		System.out.println("pop ->");
		Integer a=(Integer) st.pop();
		System.out.println(a);
		System.out.println("stack:"+st);
		
	}
	
	

}
