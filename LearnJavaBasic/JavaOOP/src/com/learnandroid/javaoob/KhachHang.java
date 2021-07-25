package com.learnandroid.javaoob;

public class KhachHang {
	private String ma;		
	private String ten;
	private int tuoi;
	private String diaChi;
	private static double x;
	public void doiThongTinCuaX(int gtmoi) {
		x = gtmoi;
	}
	public static double layThongTinX() {
		return x;
	}
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
		//this.ma = instant variable
		//ma = local variable
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	
	public KhachHang(){
		System.out.println("Constructor mặc định");
	}
	public KhachHang(String ma, String ten, int tuoi, String diaChi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return this.ma +" "+ this.ten+" "+ this.tuoi+" "+this.diaChi;
	}


}
