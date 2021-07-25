package com.learnandroid.collection;

import java.util.ArrayList;


public class ArraysListJava {

	public static void main(String[] args) {
		/*
		 * ArrayList ds = new ArrayList(); ds.add("x"); ds.add(9+"");
		 * 
		 * ArrayList ds2 = new ArrayList(); ds2.add("1.5");
		 */
		
		ArrayList ds3 = new ArrayList();
		ds3.add("An");
		ds3.add("Bình");
		ds3.add("Giải");
		ds3.add("Thoát");
		ds3.add(2,"Tèo");
		
		for (int i = 0; i < ds3.size();i++) {
			String x = ds3.get(i)+"";
			System.out.println(x);
		}
		System.out.println("++++++++++++++++++++++++++");
		for(Object data : ds3) {
			System.out.println(data);
		}
		System.out.println("++++++++++++++++++++++++++");
		ArrayList<Double> ds4 = new ArrayList<Double>();
		for(int i =0; i< 10;i++) {
			ds4.add(i*2.0);
		}
		System.out.println("Giá trị của ds 4 là: ");
		for(double x: ds4) {
			System.out.println(x);
		}
		ArrayList<Float> ds5 = new ArrayList<Float>();
		ds5.add(1.5f);
		ds5.add(1.8f);
		System.out.println("Số phần tử của ds5 là: " + ds5.size());
		ds5.add(11.11f);
		for(float x: ds5) {
			System.out.println(x);
		}
		System.out.println("Số phần tử của ds5 là: " + ds5.size());
		ds5.remove(2);
		for(float x: ds5) {
			System.out.println(x);
		}
		System.out.println("Số phần tử của ds5 là: " + ds5.size());
		ds5.set(0, 222.2f);
		for(float x: ds5) {
			System.out.println(x);
		}
		System.out.println(ds5.get(ds5.size()-1));
	}

}
