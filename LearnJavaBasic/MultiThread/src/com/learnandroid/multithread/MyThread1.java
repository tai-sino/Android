package com.learnandroid.multithread;

import java.util.Iterator;

public class MyThread1 extends Thread {
	public void run() {
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+ " i = " +i);
		}
	}
}
