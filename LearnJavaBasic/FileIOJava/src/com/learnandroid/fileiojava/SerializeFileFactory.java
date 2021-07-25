package com.learnandroid.fileiojava;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

import com.learnandroid.model.KhachHang;

public class SerializeFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKhachHangs, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dsKhachHangs);
			oos.close();
			fos.close();
			return true;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<KhachHang> docFile (String path){
		ArrayList<KhachHang> dsKhachHangs = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsKhachHangs=(ArrayList<KhachHang>) data;
			ois.close();
			fis.close();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsKhachHangs;
	}
}
