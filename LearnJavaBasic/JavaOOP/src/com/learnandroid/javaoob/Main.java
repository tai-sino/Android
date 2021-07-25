package com.learnandroid.javaoob;

public class Main {

	public static void main(String[] args) {
		KhachHang kh = new KhachHang("001","Teo",26,"LongAn");
		System.out.println(kh);
		System.out.println(kh.getTen());
		TamGiac tg = new TamGiac(1, 2, 3);
		TamGiac tg1 = new TamGiac(7, 8, 9);
		TamGiac tg2 = new TamGiac(4, 5, 6);
		System.out.println(tg);
	//demo alias
		System.out.println(tg1);
		System.out.println(tg2);
		System.out.println("===============");
		// Thực hiện gái Object tg1 = ô nhớ của Object 2
		// Lúc này khi thay đổi giá trị của Obj1 và Obj2 thì cả Obj đều thay đổi
		// Vị trí ô nhớ tại Obj1 sẽ bị garbage collection loại bỏ vì k còn obj trỏ đến
		tg1 = tg2;
		System.out.println(tg1);
		System.out.println(tg2);
		System.out.println("+++++++++++++++++");
		
		//demo static
		//biến static chia sẻ giá trị cho tất cả đối tượng trong class.		
		System.out.println("x "+ kh.layThongTinX());
		KhachHang kh1 = new KhachHang();
		//gán giá trị cho thuộc tính static của kh1 
		kh1.doiThongTinCuaX(100);
		System.out.println("x "+ kh.layThongTinX());
		// cach call static method.
		System.out.println("x "+ KhachHang.layThongTinX());
		
		
	}

}
