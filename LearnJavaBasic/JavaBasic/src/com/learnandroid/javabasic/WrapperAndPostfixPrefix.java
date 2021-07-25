package com.learnandroid.javabasic;

public class WrapperAndPostfixPrefix {

	public static void main(String[] args) {
		System.out.println("Min Interger: " + Integer.MIN_VALUE);
		System.out.println("Max Interger: " + Integer.MAX_VALUE);
		Integer a = 1;   
		//postfix và preefix
		//Postfix: ++ hoặc -- nằm đằng sau biến
		//Prefix: ++ hoặc -- nằm đằng trước biến.
		int x = 5, y = 7;
		int z = x++ + ++y -8;
		
		/*Quy tắc xử lý.
		 *B1: ƯU tiên xử lý prefix => ++y = 8
		 *B2: xử lý các phép toán còn lại
		 *B3: trả về kq biểu thức
		 *B4: Sau đó mới làm postfix
		 */
		System.out.println(x +" "+ y +" "+ z);
		// x =6, y = 8, z = 5
		System.out.println(x > y ? x : y);
		//Toán tử dk
	}
}
