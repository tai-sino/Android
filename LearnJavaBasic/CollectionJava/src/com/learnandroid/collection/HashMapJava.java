package com.learnandroid.collection;

import java.util.HashMap;

public class HashMapJava {

	public static void main(String[] args) {
		HashMap<Integer, String> ds = new HashMap<Integer, String>();
		ds.put(113, "Nguyễn Văn Tèo.");
		ds.put(114, "Teo");
		ds.put(115, "Toe");
		String nv = ds.get(114);
		System.out.println(nv);
		System.out.println("Nhân viên toàn bộ của công ty: ");
		for(String ten: ds.values()) {
			System.out.println(ten);
		}
		ds.remove(115);
		System.out.println("Nhân viên toàn bộ của công ty: ");
		for(String ten: ds.values()) {
			System.out.println(ten);
		}
	}
}
