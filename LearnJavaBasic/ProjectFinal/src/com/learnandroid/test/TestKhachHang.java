package com.learnandroid.test;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.learnandroid.io.SerializeFileFactory;
import com.learnandroid.model.KhachHang;

public class TestKhachHang {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	static int choose = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		menu();
	}

	private static void menu() {
		// TODO Auto-generated method stub
		do {
			System.out.println("========Menu========");
			System.out.println("1. Nhập khách hàng(mã số, tên, số điện thoại): ");
			System.out.println("2. Xuất khách hàng: ");
			System.out.println("3. Tìm kiếm khách hàng: ");
			System.out.println("4. Sắp xếp khách hàng: ");
			System.out.println("5. Xuất file danh sách khách hàng");
			System.out.println("6. Đọc file danh sách khách hàng");
			System.out.println("7. Thống kê theo nhà mạng: ");
			System.out.println("8. Thoát");
			System.out.println("========Menu========");
			System.out.println("Chọn: ");
			choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				xuLyNhap();			
				break;
			case 2:
				xuLyXuat();				
				break;
			case 3:
				xyLyTimKiem();
				break;
			case 4:
				xyLySapXep();				
				break;
			case 5:
				xyLyXuatFile();				
				break;
			case 6:
				xyLyDocFile();				
				break;
			case 7:
				xyLyThongKe();				
				break;	
			case 8:
				xuLyExit();				
				break;		
			default:
				System.out.println("Nhập sai rồi 1-8 thôi.");
				break;
			}
		} while (choose != 8);

	}

	private static void xuLyExit() {
		// TODO Auto-generated method stub
		System.out.println("Exit...");
		System.exit(0);
	}

	private static void xyLyThongKe() {
		// TODO Auto-generated method stub
		System.out.println("Nhập đầu số: ");
		String headPhone = new Scanner(System.in).next();
		int count =0;
		System.out.println("====================");
		System.out.println("Mã\tTên\tPhone");
		for (KhachHang khachHang : dsKH) {
			if (khachHang.getPhone().startsWith(headPhone)) {
				count++;
				
				System.out.println(khachHang);
				
			}
		}
		System.out.println("Có "+count+" Khách hàng có đầu số "+headPhone);
		
	}

	private static void xyLyDocFile() {
		dsKH = SerializeFileFactory.readFile("d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/QuanLyNV/dulieukhachhang.db");
		System.out.println("Đã đọc file thành công");
	}

	private static void xyLyXuatFile() {
		boolean kt = SerializeFileFactory.writeFile(dsKH,"d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/QuanLyNV/dulieukhachhang.db");
		if (kt) {
			System.out.println("Đã lưu file thành công");
		}
		else {
			System.out.println("Đã lưu file thất bại");
		}
	}

	private static void xyLySapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsKH);
		System.out.println("Đã sắp xếp số điện thoại rồi");
		
		
	}

	private static void xyLyTimKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập đầu số cần tìm: ");
		String phone = new Scanner(System.in).next();
		System.out.println("=====================================");
		System.out.println("Danh sách khách hàng có đầu số "+phone);
		System.out.println("Mã\tTên\tPhone");
		for (KhachHang khachHang : dsKH) {
			if (khachHang.getPhone().startsWith(phone)) {
				System.out.println(khachHang);
			}
		}
		
		
	}

	private static void xuLyXuat() {
		System.out.println("2. Xuất khách hàng: ");
		System.out.println("Danh sách tất cả khách hàng: ");
		System.out.println("===============================");
		System.out.println("Mã\tTên\tPhone");
		for (KhachHang khachHang : dsKH) {
		System.out.println(khachHang);
		}
	}

	private static void xuLyNhap() {
		System.out.println("1. Nhập khách hàng");
		System.out.println("Nhập mã Khách Hàng: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên Khách Hàng: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhập phone Khách Hàng: ");
		String phone = new Scanner(System.in).nextLine();
		KhachHang kh = new KhachHang(ma,ten,phone);
		dsKH.add(kh);			
	}

}
