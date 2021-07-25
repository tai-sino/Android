package com.learnandroid.stringarray;

public class Main {

	public static void main(String[] args) {
		String s = "Tôi yêu em 113";
		System.out.println("Chiều dài chuỗi: " + s.length());
		
		char[] arr = s.toCharArray();
		int soInHoa = 0;
		int soInThuong = 0;
		int soChuSo = 0;
		for( int i = 0; i< arr.length;i++) {
			char c = arr[i];
			if(Character.isUpperCase(c)) {
				soInHoa++;
			}
			if(Character.isLowerCase(c)) {
				soInThuong++;
			}
			if(Character.isDigit(c)) {
				soChuSo++;
			}
		}
		
		System.out.println(soChuSo + " SCS " + soInHoa + " SIH " + soInThuong + " SIT");
		for ( int i = 0; i < s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				soInHoa++;
			}
			if(Character.isLowerCase(c)) {
				soInThuong++;
			}
			if(Character.isDigit(c)) {
				soChuSo++;
			}
		}
		System.out.println(soChuSo + " SCS " + soInHoa + " SIH " + soInThuong + " SIT");
		
		String bh ="d:/music/nhactrinh/riengmotgoctroi.mp3";
		int vtcuoi = bh.lastIndexOf("/");
		String tenBaiHat = bh.substring(vtcuoi+1);
		System.out.println("Tên bài hát = " + tenBaiHat);
		
		int vtCuoiDauCham = bh.lastIndexOf(".");
		tenBaiHat = bh.substring(vtcuoi+1,vtCuoiDauCham);
		System.out.println("Tên bài hát = " + tenBaiHat);
		
	}
	/* Output
	Chiều dài chuỗi: 14
	3 SCS 1 SIH 7 SIT
	6 SCS 2 SIH 14 SIT
	Tên bài hát = riengmotgoctroi.mp3
	Tên bài hát = riengmotgoctroi
	 */

}
