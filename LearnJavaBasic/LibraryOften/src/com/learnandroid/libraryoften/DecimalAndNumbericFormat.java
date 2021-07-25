package com.learnandroid.libraryoften;

import java.text.DecimalFormat;

public class DecimalAndNumbericFormat {

	public static void main(String[] args) {
		double toan = 5;
		double ly = 8;
		double hoa = 7;
		double dtb = (toan + ly + hoa) /3;
		System.out.println(dtb);
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("Điểm TB: " + dcf.format(dtb));
				
	}

}
