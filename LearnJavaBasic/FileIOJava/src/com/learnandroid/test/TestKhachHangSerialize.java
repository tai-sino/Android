package com.learnandroid.test;

import java.util.ArrayList;

import com.learnandroid.fileiojava.SerializeFileFactory;
import com.learnandroid.fileiojava.TextFileFactory;
import com.learnandroid.model.KhachHang;

public class TestKhachHangSerialize {
	public static void testLuuFie() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Tài"));
		dsKH.add(new KhachHang("KH02", "Tèo"));
		dsKH.add(new KhachHang("KH03", "Tí"));
		dsKH.add(new KhachHang("KH04", "Tũn"));
		boolean kt = SerializeFileFactory.luuFile(dsKH, "d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/FileIOJava/dulieuSerialize.txt");
		if (kt) {
			System.out.println("Đã lưu file thành công");
		}
		else {
			System.out.println("Lưu file thất bại");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLuuFie();
		ArrayList<KhachHang> dsKhachHangs = SerializeFileFactory.docFile("d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/FileIOJava/dulieuSerialize.txt");
		System.out.println("Danh sách khách hàng đọc từ file là:");
		System.out.println("Mã\tTên" );
		for (KhachHang khachHang : dsKhachHangs) {
			System.out.println(khachHang);
		}
	}

}
