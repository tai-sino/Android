package com.learnandroid.stringarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();			
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		Arrays.sort(arr);
		System.out.println("\n Mang sau khi sort la");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}		
	}
	//Arrays.sort(arr);
	//arr1.equals(arr); so sanh hai mang so nguyen
	//Arrays.fill(arr,10); // 10,10,.... Fill vào mảng
	//int[] arr2 = Arrays.copyOf(arr1,6);// 10,10,10,10,10,10
}
