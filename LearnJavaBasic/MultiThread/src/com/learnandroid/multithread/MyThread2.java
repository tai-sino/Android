package com.learnandroid.multithread;

import java.util.Iterator;

public class MyThread2 implements Runnable {
	
	private int x = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+", i="+i +"\n\tx=" +x );
			x++;
		}
	}
	public int getX() {
		return this.x;
	}



}
