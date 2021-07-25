package com.learnandroid.exception;

public class XuLyCheckedError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 1/0;
			System.out.println("Đây là lỗi thực thi.");
		} catch (Exception e) {
			//Xuất chi tiết lỗi để kiểm tra
			e.printStackTrace();
		}
		System.out.println("Tạm biệt");
	}

}
