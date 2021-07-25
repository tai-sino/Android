package com.learnandroid.fileiojava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.learnandroid.model.KhachHang;

public class TextFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKH,String path) {
		try {
			//Tạo ra 1 file với đường dẫn là path
			FileOutputStream fos = new FileOutputStream(path);
			//định dạng cho file theo utf-8
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			//Đưa vào bộ nhớ đệm.
			BufferedWriter bw = new BufferedWriter(osw);
			for (KhachHang khachHang : dsKH) {
				//dùng các kí tự đặc biệt ít dùng để dễ tách chuỗi. ví dụ ;
				//tránh dùng @, vì là email.
				String line = khachHang.getMa() + ";" + khachHang.getTen();
				//ghi vào file
				bw.write(line);
				//xuống dòng
				bw.newLine();
			}
			//Bắt buộc đóng file sau khi sử dụng xong để save và file ko lỗi
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		//try catch ở trên bắt đc lỗi, return false
		return false;
	}
	public static ArrayList<KhachHang> docFile(String path) {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		//bắt buộc có try catch khi tương tác file
		try {
			FileInputStream fis = new FileInputStream("d:/OneDrive - VNU-HCMUS/eclipse-workspace/Android/LearnJavaBasic/FileIOJava/dulieu.txt");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//đọc dòng đầu tiền
			String line = br.readLine();
			//Nếu dòng đầu tiên = null thì file rỗng
			while(line!= null) {
				//tách dòng đầu tiên thành các thành phần đã đc ngăn bởi dấu ";"
				String[] arr = line.split(";");
				if (arr.length == 2) {
					KhachHang kh = new KhachHang(arr[0],arr[1]);
					dsKH.add(kh);
				}
				//sẽ bị rơi vòng vòng lặp vĩnh cữu nếu k đọc dòng kế tiếp.
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsKH;
	}
}
