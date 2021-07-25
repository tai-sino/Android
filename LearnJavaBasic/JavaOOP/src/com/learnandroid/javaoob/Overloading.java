package com.learnandroid.javaoob;

public class Overloading {
	//overloading method: cùng tên method nhưng signature khác nhau
	//signature:
	
	
	//Kiểu trả về không phải là signature
	//1: kiểu dữ liệu các đối số khác nhau
	public static int fn(int x,int y) {
		return x + y;
	}
	public static double fn(double x,double y) {
		return x + y +100;
	}
	//2: số lượng các đối số khác nhau
	
	public static int fn(int x,int y,int a, int b) {
		return x + y + a + b;
	}
	public static int fn(int x,int a,int d) {
		return x+a+d;
	}
	// Warning: Kiểu dữ liệu trả về không phải signature
//	public static int fn(int x) {
//		return x;
//	}
//	public static double fn(int x) {
//		return x;
//	}
	//parameter list ( số lượng dữ liệu đầu vào linh động ( mảng) )
	public static int fn2(int ...arr) {
		int sum = 0;
		for (int x : arr) {
			sum +=x;
		}
		return sum;
	}
	public static void main(String[] args) {
		//1: kiểu dữ liệu các đối số khác nhau
		System.out.println(fn(1,1));
		System.out.println(fn(1.0,1.0));
		//2: số lượng các đối số khác nhau
		System.out.println(fn(1,1,1,2));
		System.out.println(fn(10,20,30));
		// Warning: Kiểu dữ liệu trả về không phải signature
		//Error!!!
		
		//parameter list ( số lượng dữ liệu đầu vào linh động ( mảng) )
		System.out.println(fn2(1,2,3,4,5,6));
		System.out.println(fn2(1,2,3,4));
		
		
	}
}
