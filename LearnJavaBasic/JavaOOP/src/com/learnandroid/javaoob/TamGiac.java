package com.learnandroid.javaoob;

public class TamGiac {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public TamGiac(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
//		 String s = "TamGiac [a=" + a + ", b=" + b + ", c=" + c + "]";
//		if (kiemTraHopLe()==false) {
//			return s + " ==>Tam giác không đúng";
//		}else {
//			return s + "\nChu vi = " + chuVi() + "\nDien tich = " + dienTich();
//		}
		return "TamGiac [a=" + a + ", b=" + b + ", c=" + c + "]";
		
	}
	//support method ko truy cập đc từ bên ngoài (private)
	private boolean kiemTraHopLe() {
		boolean kt = this.a>0 && this.b>0&&this.c>0 &&
				(this.a+this.b)>this.c && 
				(this.a+this.c)>this.b && 
				(this.c+this.b)>this.a;
		return kt;
	}
	//service method: có thể call từ object
	public double chuVi() {
		return this.a + this.b+ this.c;
	}
	public double dienTich() {
		double p = chuVi()	/2;
		double dt = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
		return dt;		
	}
}
