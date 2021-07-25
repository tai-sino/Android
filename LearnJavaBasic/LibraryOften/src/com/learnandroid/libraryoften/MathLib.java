package com.learnandroid.libraryoften;

import java.text.DecimalFormat;

public class MathLib {

	public static void main(String[] args) {	
		DecimalFormat df = new DecimalFormat("#.##");
		//sqrt & pow
		int n = 25;
		System.out.println("Căn bậc 2 của n: " + Math.sqrt(n));
		int x = 8;
		int y = 3;
		System.out.println(x + "^" + y + " = " + Math.pow(x, y));
		//abs
		int k = -113;
		System.out.println("|" + k +"| = "+Math.abs(k) );
		//chu vi dien tich hinh tron		
		int r = 5;
		double cv = 2 * Math.PI * r;
		double dt = Math.pow(r, 2)*Math.PI;
		System.out.println("Chu vi: " +cv);
		System.out.println("Dien tich: " +dt);
		//radian
		int goc = 55;
		double rad = Math.PI*goc/180;
		System.out.println("sin("+goc+") = " + df.format(Math.sin(rad)));
		System.out.println("cos("+goc+") = " + df.format(Math.cos(rad)));
		System.out.println("tan("+goc+") = " + df.format(Math.tan(rad)));
		System.out.println("cotan("+goc+") = " + df.format(1/Math.tan(rad)));
	}

}
