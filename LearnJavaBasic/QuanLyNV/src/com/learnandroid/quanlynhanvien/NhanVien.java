package com.learnandroid.quanlynhanvien;

public class NhanVien implements Comparable<NhanVien>{
	private int ma;
	private String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhanVien(int ma, String tenString) {
		super();
		this.ma = ma;
		this.ten = tenString;
	}
	public NhanVien() {
		super();
	}
	//0 ==> OBj1 = OBJ2
	//>0 ==> OBj1 > OBJ2
	//<0 ==> OBj1 < OBJ2
	@Override
	public int compareTo(NhanVien o) {
		// ảnh hưởng đến Collections.sort
		// Dung de sort theo string
//		return this.ten.compareToIgnoreCase(o.getTen());
		//Dung de sort theo so
//		if(this.ma == o.ma)
//			return 0;
//		if (this.ma > o.ma) {
//			return 1;
//		}
//		return -1;
		
		//Dung de so sanh ten va ma so giam dan
		int ssTen = this.ten.compareToIgnoreCase(o.getTen());
		if (ssTen == 0) {
			if(this.ma == o.ma)
				return 0;
			if (this.ma > o.ma) 
				return -1;
			return 1;
		}
		return ssTen;
		
	}
	
}
