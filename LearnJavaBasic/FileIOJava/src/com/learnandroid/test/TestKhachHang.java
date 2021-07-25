package com.learnandroid.test;

import java.io.FileInputStream;
import java.util.ArrayList;

import com.learnandroid.fileiojava.TextFileFactory;
import com.learnandroid.model.KhachHang;

public class TestKhachHang {
	public static void testLuuFie() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Tài"));
		dsKH.add(new KhachHang("KH02", "Tèo"));
		dsKH.add(new KhachHang("KH03", "Tí"));
		dsKH.add(new KhachHang("KH04", "Tũn"));
		boolean kt = TextFileFactory.luuFile(dsKH, "d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/FileIOJava/dulieu1.txt");
		if (kt) {
			System.out.println("Đã lưu file thành công");
		}
		else {
			System.out.println("Lưu file thất bại");
		}
	}
	

	public static void main(String[] args) {
		testLuuFie();
		ArrayList<KhachHang> dsKhachHangs = TextFileFactory.docFile("d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/FileIOJava/dulieu1.txt");
		System.out.println("Danh sách khách hàng đọc từ file là:");
		System.out.println("Mã\tTên" );
		for (KhachHang khachHang : dsKhachHangs) {
			System.out.println(khachHang);
		}
	}
}
