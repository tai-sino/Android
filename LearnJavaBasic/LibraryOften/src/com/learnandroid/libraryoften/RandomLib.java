package com.learnandroid.libraryoften;

import java.util.Arrays;
import java.util.Random;

public class RandomLib {

	public static void main(String[] args) {
		int[] M = new int[10];
		//random(n) => 0->n-1
		Random rd = new Random();
		for(int i = 0; i < M.length;i++) {
			M[i] = rd.nextInt(100);
		}
		System.out.println("Mảng ngẫu nhiên là");
		Arrays.sort(M);
		for(int i = 0; i < M.length;i++) {
			System.out.print(M[i] + " ");
		}
		System.out.println("Mảng ngẫu nhiên là");
		//Miền giá trị từ -50 -> 50		
		for(int i = 0; i < M.length;i++) {
			M[i] = -50+rd.nextInt(101);
		}
		Arrays.sort(M);
		for(int i = 0; i < M.length;i++) {
			System.out.print(M[i] + " ");
		}
		
	}

}
