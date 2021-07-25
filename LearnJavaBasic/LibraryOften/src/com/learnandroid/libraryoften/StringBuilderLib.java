package com.learnandroid.libraryoften;

public class StringBuilderLib {

	public static void main(String[] args) {
		//Dùng StringBuilder để tối ưu tốc độ cộng String với khối lượng dữ liệu lớn.
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<100; i++) {
			builder.append("Phần tử thứ " + i);
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
}
