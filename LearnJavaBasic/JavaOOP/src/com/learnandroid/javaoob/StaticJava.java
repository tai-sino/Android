package com.learnandroid.javaoob;

public class StaticJava {
	public static int x = 0; // x la class member
	public int y;
	public static void fn() {		
		System.out.println(x);
		//static method ko gọi đc variable nonstatic.
		//vì tại thời điểm static method đc call thì variable nonstatic chưa đc tạo(ko có ô nhớ).
//		System.out.println(y); 
	}
	//normal method có thể gọi static variable bình thường
	public void fn2() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		
	}
}
