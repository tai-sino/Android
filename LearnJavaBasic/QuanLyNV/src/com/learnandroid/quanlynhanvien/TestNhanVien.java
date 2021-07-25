package com.learnandroid.quanlynhanvien;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {
	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		ds.add(new NhanVien(5,"teo"));
		ds.add(new NhanVien(1,"ti"));
		ds.add(new NhanVien(2,"an"));
		ds.add(new NhanVien(4,"binh"));
		ds.add(new NhanVien(3,"teo"));
		System.out.println("Danh sách nhân viên của công ty: ");
		for (NhanVien nv : ds) {
			System.out.println(nv.getMa() +" "+nv.getTen());
		}
		Collections.sort(ds);
		System.out.println("Danh sách nhân viên của công ty: ");
		for (NhanVien nv : ds) {
			System.out.println(nv.getMa() +" "+nv.getTen());
		}
		
	}
	
}
