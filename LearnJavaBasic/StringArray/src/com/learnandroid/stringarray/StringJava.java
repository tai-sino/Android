package com.learnandroid.stringarray;

public class StringJava {

	public static void main(String[] args) {
		String s = "   Nguyen    Van    Teo   ";
		System.out.println(s);
		s = s.trim();
		String[] arr = s.split(" ");
		String sToiUu ="";
		for(String tu : arr) {
			if(tu.trim().length() != 0)
				sToiUu += tu + " ";
		}
		System.out.println(sToiUu);
	}
	//output
	//   Nguyen    Van    Teo   
	//Nguyen Van Teo 

}
